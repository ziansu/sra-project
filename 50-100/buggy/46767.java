@org.junit.Test
public void testEnumIDLProxy() throws java.io.IOException {
    java.lang.String idl = com.baidu.bjf.remoting.protobuf.ProtobufIDLGenerator.getIDL(com.baidu.bjf.remoting.protobuf.emun.EnumPOJOClass.class);
    com.baidu.bjf.remoting.protobuf.IDLProxyObject idlProxyObject = com.baidu.bjf.remoting.protobuf.ProtobufIDLProxy.createSingle(idl);
    idlProxyObject.put("enumAttr", "STRING");
    byte[] bytes = idlProxyObject.encode();
    com.baidu.bjf.remoting.protobuf.Codec<com.baidu.bjf.remoting.protobuf.emun.EnumPOJOClass> codec = com.baidu.bjf.remoting.protobuf.ProtobufProxy.create(com.baidu.bjf.remoting.protobuf.emun.EnumPOJOClass.class);
    com.baidu.bjf.remoting.protobuf.emun.EnumPOJOClass enumPOJOClass = codec.decode(bytes);
    junit.framework.Assert.assertEquals(enumPOJOClass.enumAttr, EnumAttrPOJO.STRING);
}