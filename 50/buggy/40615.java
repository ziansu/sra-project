@org.junit.Test
public void testSetConfigurationValue() throws de.metanome.algorithm_integration.AlgorithmConfigurationException {
    java.lang.String expectedConfigurationValue = "test";
    this.algorithm.setStringConfigurationValue(pathIdentifier, expectedConfigurationValue);
    org.junit.Assert.assertEquals(expectedConfigurationValue, this.algorithm.path);
}