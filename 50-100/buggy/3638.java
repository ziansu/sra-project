public void put(java.lang.String name, java.lang.String value) {
    if ((value.length()) == 0)
        throw new core.framework.api.web.exception.BadRequestException(((("path param must not be empty, name=" + name) + ", value=") + value));
    
    try {
        params.put(name, core.framework.api.util.Encodings.decodeURIComponent(value));
    } catch (java.lang.IllegalArgumentException e) {
        throw new core.framework.api.web.exception.BadRequestException(e.getMessage(), core.framework.api.web.exception.BadRequestException.DEFAULT_ERROR_CODE, e);
    }
}