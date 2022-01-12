@org.junit.Test
public void testAbs() {
    org.scova.instrumenter.SampleClass.DerivativeStructure minusOne = new org.scova.instrumenter.SampleClass.DerivativeStructure(new org.scova.instrumenter.SampleClass.DSCompiler(), new double[]{ 1 , 0 , -1.0 });
    org.junit.Assert.Assert.assertEquals((+1.0), minusOne.abs().getPartialDerivative(0), 1.0E-15);
}