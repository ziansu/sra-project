@org.junit.Test
public void test_create_from_ymd() throws java.lang.Exception {
    org.junit.Assert.assertEquals(20140912, create(2014, 9, 12));
    org.junit.Assert.assertEquals(0, create(0, 0, 0));
    org.junit.Assert.assertEquals(11332, create(1, 13, 32));
}