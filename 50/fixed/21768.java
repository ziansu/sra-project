@org.junit.Test
public void returnEmptySetOfVariants() {
    java.util.Set<java.lang.String> result = nlProcessor.getVariants("toNieJEstSLowo");
    java.util.Set<java.lang.String> expected_result = new java.util.HashSet<java.lang.String>();
    org.junit.Assert.assertEquals(expected_result, result);
}