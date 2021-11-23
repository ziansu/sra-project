@org.junit.Test
public void useCacheRefNamespaceIsNull() {
    org.apache.ibatis.builder.MapperBuilderAssistant builder = new org.apache.ibatis.builder.MapperBuilderAssistant(new org.apache.ibatis.session.Configuration(), "resource");
    expectedException.expect(org.apache.ibatis.builder.BuilderException.class);
    expectedException.expectMessage(org.hamcrest.core.Is.is("cache-ref element requires a namespace attribute."));
    builder.useCacheRef(null);
}