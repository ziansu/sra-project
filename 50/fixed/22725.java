@org.junit.Test
public void testIsValidIPV4WhenValidIPV4() throws java.lang.Exception {
    org.apache.pig.data.Tuple tuple = org.apache.pig.test.Util.buildTuple("192.168.1.1");
    assertTrue("valid IPV4 string return true", new com.github.christiangda.pig.ip.IsValidIPV4().exec(tuple));
}