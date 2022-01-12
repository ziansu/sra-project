@org.junit.Test
public void testClone() {
    org.apache.catalina.util.URLEncoder original = new org.apache.catalina.util.URLEncoder();
    org.apache.catalina.util.URLEncoder clone = ((org.apache.catalina.util.URLEncoder) (original.clone()));
    original.setEncodeSpaceAsPlus(true);
    org.junit.Assert.assertNotEquals(original.encode(org.apache.catalina.util.TestURLEncoder.SPACE, "UTF-8"), clone.encode(org.apache.catalina.util.TestURLEncoder.SPACE, "UTF_8"));
    original.addSafeCharacter('$');
    org.junit.Assert.assertNotEquals(original.encode(org.apache.catalina.util.TestURLEncoder.DOLLAR, "UTF_8"), clone.encode(org.apache.catalina.util.TestURLEncoder.DOLLAR, "UTF_8"));
}