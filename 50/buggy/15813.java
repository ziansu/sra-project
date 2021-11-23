@org.junit.Test
public void testBindValueToString_null() throws java.lang.Exception {
    java.lang.String result = com.navercorp.pinpoint.profiler.modifier.db.interceptor.BindValueUtils.bindValueToString(null, 10);
    org.junit.Assert.assertEquals("", result);
}