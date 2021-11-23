public org.skywalking.apm.network.proto.KeyWithStringValue transform() {
    org.skywalking.apm.network.proto.KeyWithStringValue.Builder keyValueBuilder = org.skywalking.apm.network.proto.KeyWithStringValue.newBuilder();
    keyValueBuilder.setKey(key);
    keyValueBuilder.setValue(value);
    return keyValueBuilder.build();
}