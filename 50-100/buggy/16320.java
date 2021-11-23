@java.lang.Override
public void render(javax.portlet.RenderRequest renderRequest, javax.portlet.RenderResponse renderResponse) throws java.io.IOException, javax.portlet.PortletException {
    java.lang.String path = getPath(renderRequest);
    if (com.liferay.portal.kernel.util.Validator.equals(path, "/edit_article.jsp")) {
        renderRequest.setAttribute(JournalWebKeys.ITEM_SELECTOR, _itemSelector);
    }
    super.render(renderRequest, renderResponse);
}