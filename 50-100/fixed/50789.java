public void testNoTermsNoHighlight() throws java.io.IOException {
    dk.statsbiblioteket.summa.search.api.SummaSearcher searcher = getAvailableSearcher();
    if (searcher == null) {
        return ;
    }
    dk.statsbiblioteket.summa.search.api.ResponseCollection responses = searcher.search(new dk.statsbiblioteket.summa.search.api.Request(dk.statsbiblioteket.summa.search.api.document.DocumentKeys.SEARCH_QUERY, "hest", dk.statsbiblioteket.summa.search.api.document.DocumentKeys.SEARCH_RESULT_FIELDS, "recordID, fulltext_org, alto_box, pageUUID", AltoBoxSearcher.CONF_BOX, true, AltoBoxSearcher.CONF_ID_FIELD, "pageUUID"));
    java.util.List<dk.statsbiblioteket.summa.support.alto.AltoBoxResponse.Box> boxes = getBoxes(responses);
    assertEquals("Without highlighting and no requestTerms there should be no boxes", 0, boxes.size());
}