@java.lang.Override
public org.apache.wicket.request.component.IRequestablePage newPageInstance(java.lang.Class<? extends org.apache.wicket.request.component.IRequestablePage> pageClass, org.apache.wicket.request.mapper.parameter.PageParameters pageParameters) {
    return new org.brixcms.plugin.site.page.PageRenderingPage(new org.brixcms.BrixNodeModel(getNodeForUriPath(finalPath)), new org.brixcms.web.nodepage.BrixPageParameters(pageParameters));
}