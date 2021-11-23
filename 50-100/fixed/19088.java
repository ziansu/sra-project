public org.eclipse.core.runtime.IStatus run(final org.eclipse.core.runtime.IProgressMonitor monitor) {
    org.eclipse.search.ui.text.AbstractTextSearchResult textResult = ((org.eclipse.search.ui.text.AbstractTextSearchResult) (getSearchResult()));
    textResult.removeAll();
    java.util.regex.Pattern searchPattern = getSearchPattern();
    boolean searchInBinaries = true;
    org.eclipse.search.internal.ui.text.FileSearchQuery.TextSearchResultCollector collector = new org.eclipse.search.internal.ui.text.FileSearchQuery.TextSearchResultCollector(textResult, isFileNameSearch(), searchInBinaries);
    return org.eclipse.search.core.text.TextSearchEngine.create().search(fScope, collector, searchPattern, monitor);
}