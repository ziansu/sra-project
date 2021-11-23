public org.json.simple.JSONObject getDocumentById(java.lang.String documentId) throws org.json.simple.parser.ParseException {
    com.couchbase.client.java.document.JsonDocument document = bucket.get(documentId);
    if (document == null) {
        return null;
    }
    org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
    org.json.simple.JSONObject jsonObject = ((org.json.simple.JSONObject) (parser.parse(document.content().toString())));
    return jsonObject;
}