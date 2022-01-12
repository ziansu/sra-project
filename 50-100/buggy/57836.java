private void fetchFromAnnotation(annotations.Fetch... fetches) {
    for (annotations.Fetch fetchPage : fetches) {
        fetchedPages.add(fetch(fetchPage.url(), fetchPage.device(), fetchPage.method(), java.util.Collections.emptyMap(), fetchPage.referrer()));
    }
}