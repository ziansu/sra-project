public fr.unice.polytech.si3.aini.request.Request parse(java.lang.String request) throws java.lang.Exception {
    java.lang.String cleanRequest = request.replace("\r", "");
    fr.unice.polytech.si3.aini.RequestType requestType = parseRequestType(cleanRequest);
    return requestType.getRequestClass().getConstructor(java.lang.String.class).newInstance(body);
}