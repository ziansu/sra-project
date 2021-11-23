@org.springframework.web.bind.annotation.RequestMapping(value = "/news")
public java.lang.String news(@org.springframework.web.bind.annotation.RequestParam(value = "News", required = false)
java.lang.String newsType, @org.springframework.web.bind.annotation.RequestParam(value = "NewsId", required = false)
java.lang.Long newsId, @org.springframework.web.bind.annotation.ModelAttribute
it.sevenbits.FacultySite.web.domain.gallery.ImageDescriptionForm form, org.springframework.ui.Model model) {
    it.sevenbits.FacultySite.web.controllers.NewsController.LOG.info(("News type param: " + newsType));
    it.sevenbits.FacultySite.web.controllers.NewsController.LOG.info(("News id param: " + newsId));
    return it.sevenbits.FacultySite.web.controllers.NewsController.constructNews(newsType, newsId, form, false, model, contentOfPagesService);
}