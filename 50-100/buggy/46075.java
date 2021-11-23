private void generateRequestBuilder() {
    org.jboss.errai.codegen.framework.Statement urlEncoder = org.jboss.errai.codegen.framework.util.Stmt.invokeStatic(com.google.gwt.http.client.URL.class, "encode", org.jboss.errai.codegen.framework.util.Stmt.loadVariable("url").invoke("toString"));
    org.jboss.errai.codegen.framework.Statement requestBuilder = org.jboss.errai.codegen.framework.util.Stmt.declareVariable("requestBuilder", com.google.gwt.http.client.RequestBuilder.class, org.jboss.errai.codegen.framework.util.Stmt.newObject(com.google.gwt.http.client.RequestBuilder.class).withParameters(resourceMethod.getHttpMethod(), urlEncoder));
    methodBlock.append(requestBuilder);
}