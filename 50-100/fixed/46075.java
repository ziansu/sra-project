private void generateRequestBuilder() {
    org.jboss.errai.codegen.framework.Statement requestBuilder = org.jboss.errai.codegen.framework.util.Stmt.declareVariable("requestBuilder", com.google.gwt.http.client.RequestBuilder.class, org.jboss.errai.codegen.framework.util.Stmt.newObject(com.google.gwt.http.client.RequestBuilder.class).withParameters(resourceMethod.getHttpMethod(), org.jboss.errai.codegen.framework.util.Stmt.loadVariable("url").invoke("toString")));
    methodBlock.append(requestBuilder);
}