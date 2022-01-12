fr.jouy.inra.maiage.bibliome.alvis.web.runs.Run createRun(alvisnlp.module.Sequence<alvisnlp.corpus.Corpus> plan, com.sun.jersey.api.core.HttpContext httpContext, com.sun.jersey.multipart.FormDataMultiPart formData, fr.jouy.inra.maiage.bibliome.alvis.web.executor.AlvisNLPExecutor executor, java.lang.String... excludedParams) throws java.io.IOException {
    fr.jouy.inra.maiage.bibliome.alvis.web.runs.Run result = new fr.jouy.inra.maiage.bibliome.alvis.web.runs.Run(rootProcessingDir, plan, executor);
    com.sun.jersey.api.core.HttpRequestContext requestContext = httpContext.getRequest();
    if (formData != null) {
        fr.jouy.inra.maiage.bibliome.alvis.web.RunResource.setFormParams(formData, result);
    }
    fr.jouy.inra.maiage.bibliome.alvis.web.RunResource.setQueryParams(requestContext, result, excludedParams);
    result.write();
    return result;
}