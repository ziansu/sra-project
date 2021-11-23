@org.junit.Test
public void testGetFactors() {
    org.junit.Assert.assertEquals("{}", be.inniger.euler.util.Maths.getFactors(1).toString());
    org.junit.Assert.assertEquals("{2=1}", be.inniger.euler.util.Maths.getFactors(2).toString());
    org.junit.Assert.assertEquals("{2=2}", be.inniger.euler.util.Maths.getFactors(4).toString());
    org.junit.Assert.assertEquals("{2=2, 3=1, 7=1}", be.inniger.euler.util.Maths.getFactors(84).toString());
}