@org.junit.Test
public void messagesMustWorkWithAllServiceVersions() throws com.google.protobuf.InvalidProtocolBufferException {
    byte[] out1 = serviceV1.preValidate(testData.toByteArray());
    assertProperties(testData, testData.newBuilderForType().mergeFrom(out1).build(), 2);
    byte[] out2 = serviceV2.preValidate(testData.toByteArray());
    assertProperties(testData, testData.newBuilderForType().mergeFrom(out2).build(), 0);
}