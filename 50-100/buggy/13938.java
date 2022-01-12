@org.junit.Test
public void checkRpcContext() {
    setUp();
    org.onosproject.yang.model.ResourceId.Builder rIdBlr = org.onosproject.yang.runtime.SerializerHelper.initializeResourceId(context);
    rIdBlr = org.onosproject.yang.runtime.SerializerHelper.addToResourceId(rIdBlr, "hello-world", org.onosproject.yang.runtime.impl.RpcContextTest.NS, value);
    org.onosproject.yang.runtime.impl.DefaultSchemaContextProvider scp = new org.onosproject.yang.runtime.impl.DefaultSchemaContextProvider(reg);
    org.onosproject.yang.model.RpcContext context = scp.getRpcContext(rIdBlr.build());
    org.junit.Assert.assertEquals(context.rpcName(), "helloWorld");
    org.junit.Assert.assertEquals(context.serviceIntf().toString(), ("interface org.onosproject" + ".yang.gen.v1.hello.rev20150105.HelloService"));
}