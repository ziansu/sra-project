@org.junit.Test
public void testGetPseudoResidual() {
    org.junit.Assert.assertEquals(0.5, mltk.util.OptimUtils.getPseudoResidual(0, 1), MathUtils.EPSILON);
    org.junit.Assert.assertEquals((-0.5), mltk.util.OptimUtils.getPseudoResidual(0, 0), MathUtils.EPSILON);
}