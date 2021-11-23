@org.springframework.web.bind.annotation.RequestMapping(value = "/getProjectIntro", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public com.ingzone.base.Result getProjectIntro(com.ingzone.model.dto.Page page) {
    java.lang.System.out.println(("xxxxxxx" + page));
    if (((((page == null) || ((page.getPage()) == null)) || ((page.getRows()) == null)) || ((page.getPage()) <= 0)) || ((page.getRows()) <= 0)) {
        return com.ingzone.cache.ResultCache.FAILURE;
    }
    return projectService.getProjectIntro(page);
}