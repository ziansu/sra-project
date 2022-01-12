public void jsonEquals(com.jayway.restassured.response.Response actual, org.json.JSONObject[] expected) {
    com.mbi.EqualityAsserter asserter = new com.mbi.EqualityAsserter();
    asserter.assertEquals(new org.json.JSONArray(actual.asString()), asserter.objectsToArray(expected), mode, ignore);
    setDefault();
}