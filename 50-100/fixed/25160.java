public <T> T parseQueryResult(java.lang.String queryResult) {
    org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
    T result;
    try {
        result = ((T) (parser.parse(queryResult)));
        return result;
    } catch (org.json.simple.parser.ParseException e) {
        java.util.logging.Logger.getLogger(this.getClass().getSimpleName()).log(java.util.logging.Level.WARNING, ("buildAndSendApiRequest::Error parsing the response. Response received: " + queryResult));
        return result = null;
    }
}