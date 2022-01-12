private fitnesse.http.Response createChildPageAndMakeResponse(fitnesse.FitNesseContext context) {
    createChildPage(context);
    fitnesse.http.SimpleResponse response = new fitnesse.http.SimpleResponse();
    fitnesse.responders.editing.WikiPagePath fullPathOfCurrentPage = currentPage.getPageCrawler().getFullPath();
    response.redirect(context.contextRoot, fullPathOfCurrentPage.toString());
    return response;
}