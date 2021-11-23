@org.junit.Test
public void test_days() throws java.lang.Exception {
    org.junit.Assert.assertEquals(20140912, dint.Dint.addDays(20140911, 1));
    org.junit.Assert.assertEquals(20140912, dint.Dint.addDays(20140913, (-1)));
    org.junit.Assert.assertEquals(20140912, dint.Dint.addDays(20150912, (-365)));
    org.junit.Assert.assertEquals(20140912, dint.Dint.addDays(20141012, (-30)));
}