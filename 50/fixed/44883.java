private org.biokoframework.http.response.IResponseContentBuilder findBuilderByRequestContentType(javax.servlet.http.HttpServletRequest request) {
    if (!(org.apache.commons.lang3.StringUtils.isEmpty(request.getContentType()))) {
        return findBuilderForMediaType(com.google.common.net.MediaType.parse(request.getContentType().trim()));
    }
    return null;
}