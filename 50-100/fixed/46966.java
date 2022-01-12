@org.junit.Test
public void TestCustomAttributeSerdesTrip() throws java.lang.Exception {
    java.lang.String json = io.intercom.api.TestSupport.load("user.json");
    final io.intercom.api.User user = io.intercom.api.UserTest.mapper.readValue(json, io.intercom.api.User.class);
    final java.lang.String json1 = io.intercom.api.UserTest.mapper.writeValueAsString(user);
    final io.intercom.api.User user1 = io.intercom.api.UserTest.mapper.readValue(json1, io.intercom.api.User.class);
    assertEquals(user.getCustomAttributes(), user1.getCustomAttributes());
}