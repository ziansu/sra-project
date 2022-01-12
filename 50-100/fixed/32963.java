@java.lang.Override
protected void merge(java.util.Map<java.lang.String, java.lang.Object> renderArgs, org.osgl.http.H.Response response) {
    if (act.Act.isDev()) {
        super.merge(renderArgs, response);
        return ;
    }
    beetlTemplate.binding(renderArgs);
    view.templateModifier.apply(beetlTemplate);
    if (view.directByteOutput) {
        beetlTemplate.renderTo(response.outputStream());
    }else {
        beetlTemplate.renderTo(response.writer());
    }
}