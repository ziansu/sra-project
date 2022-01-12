@webService.GET
@webService.Produces(value = "application/json")
@webService.Path(value = "/{authorFirst}/{authorLast}")
public java.lang.String getRecomendationWithTitleAndAuthor(@webService.PathParam(value = "authorFirst")
java.lang.String authorFirst, @webService.PathParam(value = "authorLast")
java.lang.String authorLast) {
    webService.GoodreadsAPI apiRequest = new webService.GoodreadsAPI();
    java.lang.String xml = "";
    try {
        xml = apiRequest.getBooksByAuthorName(((authorFirst + "%20") + authorLast));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (org.xml.sax.SAXException e) {
        e.printStackTrace();
    }
}