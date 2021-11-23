public void test_asm() throws java.lang.Exception {
    com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory factory = new com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory(new com.alibaba.fastjson.util.ASMClassLoader());
    java.lang.Exception error = null;
    try {
        com.alibaba.fastjson.util.JavaBeanInfo beanInfo = com.alibaba.fastjson.util.JavaBeanInfo.build(int.class, int.class, null);
        factory.createJavaBeanDeserializer(com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance(), beanInfo);
    } catch (java.lang.Exception ex) {
        error = ex;
    }
    assertNotNull(error);
}