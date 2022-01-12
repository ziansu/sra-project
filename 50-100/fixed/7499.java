@org.junit.Test
public void test_isLeapYear() throws java.lang.Exception {
    org.junit.Assert.assertEquals(false, isLeapYear(2014));
    org.junit.Assert.assertEquals(false, isLeapYear(2015));
    org.junit.Assert.assertEquals(true, isLeapYear(2016));
    org.junit.Assert.assertEquals(false, isLeapYear(2017));
}