@org.junit.Test
public void module3() throws java.lang.Exception {
    x = new xyz.sonion.rsa.MyBigHex("FF96");
    y = new xyz.sonion.rsa.MyBigHex("1");
    z = ((xyz.sonion.rsa.MyBigHex) (x.module(y)));
    org.junit.Assert.assertEquals("0", z.toString());
    org.junit.Assert.assertEquals("FF96", x.toString());
    org.junit.Assert.assertEquals("1", y.toString());
}