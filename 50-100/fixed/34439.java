private void fetchResource(java.lang.String context, org.code4j.jproxy.handler.http.HttpRequest request, io.netty.channel.ChannelHandlerContext ctx) {
    java.util.regex.Pattern css_pattern = java.util.regex.Pattern.compile(((".+\\.(" + (org.code4j.jproxy.util.WebUtil.CSS_FILE)) + ").*"));
    if (css_pattern.matcher(request.uri()).matches()) {
        fetchImageResource(org.code4j.jproxy.util.WebUtil.fetchImageFromString(context), ctx, request.headers());
    }
}