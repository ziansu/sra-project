@org.junit.Test
public void testDivisionByZero() {
    pt = new IWVG.SwC.Chinegua.calculos.Fraction(1, 2);
    pt2 = new IWVG.SwC.Chinegua.calculos.Fraction(1, 0);
    exception.expect(java.lang.ArithmeticException.class);
    assertEquals(0.5, pt.multiplyFraction(pt, pt2), 0.5);
}