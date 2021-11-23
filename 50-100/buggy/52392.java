public picoded.servlet.api.ApiResponse execute(int inMajor, int inMinor, java.lang.String path, picoded.servlet.api.ApiRequest reqObj, picoded.servlet.api.ApiResponse resObj) {
    picoded.servlet.api.ApiEndpoint endpoint = fetchApiEndpoint(inMajor, inMinor, path);
    if (endpoint != null) {
        return endpoint.execute(reqObj, resObj);
    }
    return null;
}