private org.json.JSONArray getJSONFromURL(java.lang.String URL) {
    org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
    headers.set("Authorization", "Basic YjE0NTY4NzdAdHJidm4uY29tOkVudEFsbFN0YXJSZWRvbmVBbGxBcXVpcmVk");
    org.springframework.http.HttpEntity<java.lang.String> entity = new org.springframework.http.HttpEntity<java.lang.String>("parameters", headers);
    org.springframework.http.ResponseEntity<java.lang.String> results = restCall.exchange(URL, HttpMethod.GET, entity, java.lang.String.class);
    try {
        org.json.JSONArray jsonResults = new org.json.JSONArray(results.getBody());
        return jsonResults;
    } catch (org.json.JSONException e) {
        return null;
    }
}