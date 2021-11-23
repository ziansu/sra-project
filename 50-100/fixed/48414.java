@java.lang.Override
protected org.eclipse.ui.views.contentoutline.PageRec doCreatePage(org.eclipse.ui.IWorkbenchPart part) {
    org.eclipse.ui.views.contentoutline.IContentOutlinePage page = org.eclipse.ui.internal.views.ViewsPlugin.getAdapter(part, org.eclipse.ui.views.contentoutline.IContentOutlinePage.class, false);
    if (page != null) {
        if (page instanceof org.eclipse.ui.part.IPageBookViewPage) {
            initPage(((org.eclipse.ui.part.IPageBookViewPage) (page)));
        }
        page.createControl(getPageBook());
        return new org.eclipse.ui.views.contentoutline.PageRec(part, page);
    }
    return null;
}