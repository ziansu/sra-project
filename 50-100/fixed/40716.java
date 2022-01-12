@org.junit.Test
public void testGetFactors() {
    org.junit.Assert.assertEquals("{}", getFactors(1).toString());
    org.junit.Assert.assertEquals("{2=1}", getFactors(2).toString());
    org.junit.Assert.assertEquals("{2=2}", getFactors(4).toString());
    org.junit.Assert.assertEquals("{2=2, 3=1, 7=1}", getFactors(84).toString());
}