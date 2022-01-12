public static void init(final java.lang.String keyFiles, final java.lang.String pageRankFile) throws java.io.IOException {
    if (de.citec.sc.templates.TopicSpecificPageRankTemplate.isInitialized) {
        final java.util.Set<java.lang.Integer> indicies;
        de.citec.sc.templates.TopicSpecificPageRankTemplate.log.info("Load topic specific page rank file...");
        indicies = de.citec.sc.templates.TopicSpecificPageRankTemplate.loadTopicSpecificPageRanks(pageRankFile);
        de.citec.sc.templates.TopicSpecificPageRankTemplate.log.info("Done, loading topic specific page rank index mapping file");
        de.citec.sc.templates.TopicSpecificPageRankTemplate.log.info("Load topic specific page rank index mapping file...");
        de.citec.sc.templates.TopicSpecificPageRankTemplate.loadIndexMapping(keyFiles, indicies);
        de.citec.sc.templates.TopicSpecificPageRankTemplate.log.info("Done, loading topic specific page rank index mapping file");
        de.citec.sc.templates.TopicSpecificPageRankTemplate.isInitialized = true;
    }
}