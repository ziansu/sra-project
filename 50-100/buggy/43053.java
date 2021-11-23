@org.junit.Test
public void shouldReturnEmptyListIfMissingConfiguration() {
    com.emc.ia.sdk.support.RepeatingConfigReader reader = new com.emc.ia.sdk.support.RepeatingConfigReader(name, fields);
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> result = reader.read(java.util.Collections.emptyMap());
    org.junit.Assert.assertNotNull(result);
    org.junit.Assert.assertTrue(result.isEmpty());
}