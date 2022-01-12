@org.springframework.web.bind.annotation.RequestMapping(value = "/search", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView doGet(javax.servlet.http.HttpServletRequest request) {
    javax.servlet.http.HttpSession session = request.getSession();
    java.lang.String requestQuery = request.getParameter("search");
    java.util.List<kawahara.models.SearchModel> allSearchResults = searchService.getSearchResults(requestQuery);
    int pageIndex = getPageIndex(session, requestQuery, allSearchResults, request);
    return setAttributes(session, requestQuery, pageIndex, allSearchResults);
}