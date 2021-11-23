@org.junit.Test
public void updateDesiredPropertyEmptyMapSucceed() {
    tests.unit.com.microsoft.azure.sdk.iot.deps.serializer.TwinParser twinParser = new tests.unit.com.microsoft.azure.sdk.iot.deps.serializer.TwinParser();
    java.util.Map<java.lang.String, java.lang.Object> newValues = new java.util.HashMap<>();
    java.lang.String json = twinParser.updateDesiredProperty(newValues);
    assertNull(json);
    assertNull(twinParser.getDesiredPropertyMap());
}