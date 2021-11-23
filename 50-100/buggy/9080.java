public http.Header getHeader(java.lang.String header) throws http.exceptions.BadRequestException {
    if ((header.split(": ").length) != 2) {
        throw new http.exceptions.BadRequestException();
    }
    for (http.Header.Type type : http.Header.Type.values()) {
        if (header.startsWith(type.type)) {
            return new http.Header(header.split(":")[1], type);
        }
    }
    return new http.Header(header.split(":")[1], http.Header.Type.UnknownHeader);
}