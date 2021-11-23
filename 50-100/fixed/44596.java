@org.junit.Test
public void precisionTest() {
    org.junit.Assert.assertTrue("failure - should be true", tester.precisionCompare(1, 1.0));
    org.junit.Assert.assertTrue("failure - should be true", tester.precisionCompare(1, 1.01));
    org.junit.Assert.assertTrue("failure - should be true", tester.precisionCompare(1, 0.99));
    org.junit.Assert.assertFalse("failure - should be false", tester.precisionCompare(1, 1.02));
    org.junit.Assert.assertFalse("failure - should be false", tester.precisionCompare(1, 0.98));
}