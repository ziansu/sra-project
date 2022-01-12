@org.junit.Test
public void testTrustCoefficientNumSteps() {
    org.junit.Assert.assertEquals("indirect connection", 2, trustGenerator.trustCoefficientNumSteps(moe.cdn.cweb.TrustGeneratorTest.a, moe.cdn.cweb.TrustGeneratorTest.c, 3), 0.001);
    org.junit.Assert.assertEquals("indirect connect not enough steps", 0, trustGenerator.trustCoefficientNumSteps(moe.cdn.cweb.TrustGeneratorTest.a, moe.cdn.cweb.TrustGeneratorTest.c, 1), 0.001);
    org.junit.Assert.assertEquals("no connection num steps", 0, trustGenerator.trustCoefficientNumSteps(moe.cdn.cweb.TrustGeneratorTest.a, moe.cdn.cweb.TrustGeneratorTest.d, 5), 0.001);
}