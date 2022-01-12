@it.sevenbits.FacultySite.web.controllers.RequestMapping(value = "/hidden_content")
public java.lang.String hiddenContent(@it.sevenbits.FacultySite.web.controllers.RequestParam(value = "News", required = false)
java.lang.String newsType, @it.sevenbits.FacultySite.web.controllers.RequestParam(value = "NewsId", required = false)
java.lang.Long newsId, @it.sevenbits.FacultySite.web.controllers.ModelAttribute
it.sevenbits.FacultySite.web.domain.gallery.ImageDescriptionForm form, org.springframework.ui.Model model) {
    it.sevenbits.FacultySite.web.controllers.ContentController.LOG.info(("News type param: " + newsType));
    it.sevenbits.FacultySite.web.controllers.ContentController.LOG.info(("News id param: " + newsId));
    return it.sevenbits.FacultySite.web.controllers.NewsController.constructNews(newsType, newsId, form, true, model, contentOfPagesService);
}