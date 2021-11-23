@org.junit.Test
public void updateReportedPropertyNullValuesSucceed() {
    tests.unit.com.microsoft.azure.sdk.iot.deps.serializer.TwinParser twinParser = new tests.unit.com.microsoft.azure.sdk.iot.deps.serializer.TwinParser();
    java.util.Map<java.lang.String, java.lang.Object> newValues = new java.util.HashMap<>();
    newValues.put("key1", null);
    newValues.put("key2", null);
    java.lang.String json = twinParser.updateReportedProperty(newValues);
    tests.unit.com.microsoft.azure.sdk.iot.deps.serializer.Helpers.assertJson(json, "{\"key1\":null,\"key2\":null}");
    assertNull(twinParser.getReportedPropertyMap());
}