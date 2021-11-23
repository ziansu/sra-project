@com.project.articles.services.Path(value = "/searchedarticles")
@com.project.articles.services.POST
@com.project.articles.services.Consumes(value = "application/x-www-form-urlencoded")
@com.project.articles.services.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.util.List<com.project.articles.dto.ArticlesResponseDto> findSearchedArticles(@com.project.articles.services.FormParam(value = "search")
java.lang.String search) {
    java.util.List<java.lang.String> requestList = new java.util.ArrayList<java.lang.String>();
    java.util.StringTokenizer st = new java.util.StringTokenizer(search);
    while (st.hasMoreTokens()) {
        requestList.add(st.nextToken());
    } 
    java.util.List<com.project.articles.entity.Article> searchedArticlesList = articleDao.findSearchedArticles(requestList);
    java.util.List<com.project.articles.dto.ArticlesResponseDto> finalList = doArticlesMapping(searchedArticlesList);
    return finalList;
}