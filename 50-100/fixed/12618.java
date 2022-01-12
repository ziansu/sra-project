@org.junit.Test
public void test_addYears() throws java.lang.Exception {
    org.junit.Assert.assertEquals(20140912, addYears(20140912, 0));
    org.junit.Assert.assertEquals(20140912, addYears(20130912, 1));
    org.junit.Assert.assertEquals(20140912, addYears(20150912, (-1)));
    org.junit.Assert.assertEquals(20140912, addYears(10140912, 1000));
    org.junit.Assert.assertEquals(20160228, addYears(20140228, 2));
}