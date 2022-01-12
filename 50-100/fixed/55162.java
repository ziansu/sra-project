public void processEventsFromFolder(java.lang.String eventsFolder) {
    if (configuration.Configuration.single_event_processing)
        processEventsFromFolderSingleThread(eventsFolder);
    else {
        long createWorkTime = java.lang.System.currentTimeMillis();
        if ((configuration.Configuration.multiple_event_processing_dynamic_block) > 0)
            eventsFromFolderDynamicScheduling(eventsFolder, Configuration.multiple_event_processing_dynamic_block);
        else
            eventsFromFolderStaticScheduling(eventsFolder, Configuration.multiple_event_processing_threads);
        
        statistics.Statistics.filtersCreateWorkTime += (java.lang.System.currentTimeMillis()) - createWorkTime;
        threadsProcessEventsFromFolder(eventsFolder, Configuration.multiple_event_processing_threads);
    }
}