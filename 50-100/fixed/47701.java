public static void shutdown(java.util.Collection<? extends com.spinn3r.artemis.threads.Shutdownable> shutdownableList) throws java.lang.Exception {
    java.util.List<java.lang.Exception> exceptions = com.google.common.collect.Lists.newArrayList();
    for (com.spinn3r.artemis.threads.Shutdownable shutdownable : shutdownableList) {
        try {
            if (shutdownable == null)
                continue;
            
            shutdownable.shutdown();
        } catch (java.lang.Exception e) {
            exceptions.add(e);
        }
    }
    if ((exceptions.size()) > 0)
        throw com.spinn3r.artemis.util.misc.Throwables.createMultiException(exceptions);
    
}