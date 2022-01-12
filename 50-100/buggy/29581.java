@me.doubledutch.stroom.query.sql.Test
public void testNickSample() throws java.lang.Exception {
    java.lang.String str = "[{\"foo\":[{}],\"[]\":\"{}\"}]";
    me.doubledutch.stroom.query.sql.JSONArray input = new me.doubledutch.stroom.query.sql.JSONArray(str);
    me.doubledutch.stroom.query.sql.JSONObject obj = input.getJSONObject(0);
    assertNotNull(obj);
    me.doubledutch.stroom.query.sql.JSONArray arr = obj.getJSONArray("foo");
    assertNotNull(arr);
    me.doubledutch.stroom.query.sql.JSONObject obj2 = arr.getJSONObject(0);
    assertNotNull(obj2);
    assertEquals(obj.getString("[]"), "{}");
}