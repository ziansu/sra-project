@org.junit.Test
public void useCacheRefNamespaceIsUndefined() {
    org.apache.ibatis.builder.MapperBuilderAssistant builder = new org.apache.ibatis.builder.MapperBuilderAssistant(new org.apache.ibatis.session.Configuration(), "resource");
    expectedException.expect(org.apache.ibatis.builder.IncompleteElementException.class);
    expectedException.expectMessage(org.hamcrest.core.Is.is("No cache for namespace 'eee' could be found."));
    builder.useCacheRef("eee");
}