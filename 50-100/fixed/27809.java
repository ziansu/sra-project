private dk.statsbiblioteket.summa.common.filter.object.ObjectFilter getSplitter(dk.statsbiblioteket.summa.common.unittest.PayloadFeederHelper source, int maxHeadlineWords, boolean isDeleted) {
    for (dk.statsbiblioteket.summa.common.filter.Payload payload : source.getPayloads()) {
        payload.getRecord().setDeleted(isDeleted);
    }
    dk.statsbiblioteket.summa.common.filter.object.ObjectFilter splitter = new dk.statsbiblioteket.summa.ingest.split.StreamController(dk.statsbiblioteket.summa.common.configuration.Configuration.newMemoryBased(StreamController.CONF_PARSER, dk.statsbiblioteket.summa.support.doms.DOMSNewspaperParser.class.getCanonicalName(), DOMSNewspaperParser.CONF_HEADLINE_MAX_WORDS, maxHeadlineWords));
    splitter.setSource(source);
    return splitter;
}