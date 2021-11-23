@org.springframework.web.bind.annotation.RequestMapping
public java.lang.String showPreferences(javax.portlet.RenderRequest request, javax.portlet.RenderResponse response, org.springframework.ui.Model model) throws com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
    model.addAttribute("preferences", new org.xcolab.portlets.contentdisplay.util.ContentDisplayPreferences(request));
    final java.util.List<org.xcolab.client.contents.pojo.ContentArticle> contentArticles = org.xcolab.client.contents.ContentsClient.getContentArticles(org.xcolab.portlets.contentdisplay.views.ContentDisplayPreferencesController.CONTENT_FOLDER_ID);
    model.addAttribute("contentArticles", contentArticles);
    return "preferences";
}