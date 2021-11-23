private static void handleListTopics(de.kazkazi.webmethods.ummer.intf.backend.UniversalMessagingInterface um, org.apache.commons.cli.CommandLine line, com.pcbsys.nirvana.client.nSession session) throws de.kazkazi.webmethods.ummer.intf.backend.exceptions.ActionNotPossibleException {
    if ((line.hasOption(de.kazkazi.webmethods.ummer.UmmerApplication.LIST_TOPICS_SHORT_OPTION)) || (line.hasOption(de.kazkazi.webmethods.ummer.UmmerApplication.LIST_TOPICS_LONG_OPTION))) {
        de.kazkazi.webmethods.ummer.UmmerApplication.logger.info("Listing topics");
        java.util.List<com.pcbsys.nirvana.client.nChannel> topics = um.getAllTopics(session);
        for (com.pcbsys.nirvana.client.nChannel topic : topics) {
            java.lang.System.out.println(topic.getName());
            de.kazkazi.webmethods.ummer.UmmerApplication.logger.info(topic.getName());
        }
    }
}