@java.lang.Override
protected void merge(java.util.Map<java.lang.String, java.lang.Object> renderArgs, org.osgl.http.H.Response response) {
    if (act.Act.isDev()) {
        super.merge(renderArgs, response);
        return ;
    }
    try {
        tmpl.process(renderArgs, response.writer());
    } catch (java.lang.Exception e) {
        throw org.osgl.util.E.unexpected(e, "Error output freemarker template");
    }
}