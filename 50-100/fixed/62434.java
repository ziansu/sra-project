@org.junit.Test
public void hash() {
    org.junit.Assert.assertEquals(32, jetbrick.util.PasswordUtils.hash("").length());
    org.junit.Assert.assertEquals(32, jetbrick.util.PasswordUtils.hash("admin").length());
    org.junit.Assert.assertEquals(32, jetbrick.util.PasswordUtils.hash("123").length());
    org.junit.Assert.assertEquals(32, jetbrick.util.PasswordUtils.hash("中文").length());
}