@java.lang.Override
public org.clojars.kyleannen.javaserver.ResponseParameters getResponse(org.clojars.kyleannen.javaserver.RequestParameters requestParameters) throws java.io.IOException {
    java.lang.String responseJSON = org.clojars.kyleannen.jsontictactoe.IntegratorJSON.submitRound(requestParameters.bodyContent);
    return new org.clojars.kyleannen.javaserver.ResponseParameters.ResponseBuilder(200).setDate().setContentType(".json").setContentLength(responseJSON).setContentDisposition(".html").setBodyType(responseJSON).setBodyContent(responseJSON).setAccessControlAllowOrigin(requestParameters.host).build();
}