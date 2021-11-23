public void testEnabledNoHighlight() throws java.io.IOException {
    dk.statsbiblioteket.summa.search.api.SummaSearcher searcher = getAvailableSearcher();
    if (searcher == null) {
        return ;
    }
    dk.statsbiblioteket.summa.search.api.ResponseCollection responses = getAvailableSearcher().search(new dk.statsbiblioteket.summa.search.api.Request(dk.statsbiblioteket.summa.search.api.document.DocumentKeys.SEARCH_QUERY, "hest", dk.statsbiblioteket.summa.search.api.document.DocumentKeys.SEARCH_RESULT_FIELDS, "recordID, fulltext_org, alto_box, pageUUID", AltoBoxSearcher.SEARCH_BOX, true, AltoBoxSearcher.SEARCH_ID_FIELD, "", AltoBoxSearcher.SEARCH_ID_REGEXP, ("(doms_newspaperCollection:uuid:[0-9abcdef]{8}-[0-9abcdef]{4}-" + "[0-9abcdef]{4}-[0-9abcdef]{4}-[0-9abcdef]{12}).*"), AltoBoxSearcher.SEARCH_ID_TEMPLATE, "$1", "solrparam.hl", false));
    java.util.List<dk.statsbiblioteket.summa.support.alto.AltoBoxResponse.Box> boxes = getBoxes(responses);
    assertTrue("Without highlighting there should be no boxes", boxes.isEmpty());
}