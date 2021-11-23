@org.junit.Test
public void shouldReturnEmptyListIfMissingConfiguration() {
    com.emc.ia.sdk.support.RepeatingConfigReader reader = new com.emc.ia.sdk.support.RepeatingConfigReader(name, fields);
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> result = reader.read(java.util.Collections.emptyMap());
    assertNotNull(result);
    assertTrue(result.isEmpty());
}