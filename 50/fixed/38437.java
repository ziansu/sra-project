@org.junit.Test
public void test_create_from_Calendar() throws java.lang.Exception {
    org.junit.Assert.assertEquals(20140912, create(create20140912Calendar()));
}