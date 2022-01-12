public void doubleClick(org.eclipse.jface.viewers.DoubleClickEvent event) {
    if (!((event.getSelection()) instanceof org.eclipse.jface.viewers.IStructuredSelection)) {
        return ;
    }
    @java.lang.SuppressWarnings(value = "unchecked")
    org.eclipse.jubula.client.ui.rcp.search.result.BasicSearchResult.SearchResultElement<java.lang.Long> element = ((org.eclipse.jubula.client.ui.rcp.search.result.BasicSearchResult.SearchResultElement<java.lang.Long>) (((org.eclipse.jface.viewers.IStructuredSelection) (event.getSelection())).getFirstElement()));
    element.jumpToResult();
}