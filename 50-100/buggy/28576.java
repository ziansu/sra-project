public fr.unice.polytech.si3.aini.request.Request parse(java.lang.String request) throws fr.unice.polytech.si3.aini.exception.BadRequestException {
    java.lang.String cleanRequest = request.replace("\r", "");
    fr.unice.polytech.si3.aini.RequestParser.logger.debug(("Request received: " + cleanRequest));
    fr.unice.polytech.si3.aini.RequestType requestType = parseRequestType(cleanRequest);
    try {
        return requestType.getRequestClass().getConstructor(java.lang.String.class).newInstance(body);
    } catch (java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
        throw new fr.unice.polytech.si3.aini.exception.BadRequestException();
    }
}