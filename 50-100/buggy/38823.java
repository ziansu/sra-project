public final me.tomassetti.Answer process(V value, java.util.Map<java.lang.String, java.lang.String> urlParams, boolean shouldReturnHtml) {
    if (!(value.isValid())) {
        return new me.tomassetti.Answer(me.tomassetti.AbstractRequestHandler.HTTP_BAD_REQUEST);
    }else {
        return processImpl(value, urlParams, shouldReturnHtml);
    }
}