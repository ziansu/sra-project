@org.springframework.web.bind.annotation.RequestMapping(value = "/resetImgPerPage", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView resetImagesPerPage(@org.springframework.web.bind.annotation.RequestParam(value = "imgsPerPage")
java.lang.String imgsPerPage) {
    this.userSession.getSearchResult().setImgsPerPage(java.lang.Integer.valueOf(imgsPerPage.substring(0, imgsPerPage.indexOf("/"))));
    this.userSession.getSearchResult().setCurrentPage((-1));
    com.spring.study.model.Page page = this.imageService.getPage(this.userSession.getSearchResult());
    return new org.springframework.web.servlet.ModelAndView("home", "page", page);
}