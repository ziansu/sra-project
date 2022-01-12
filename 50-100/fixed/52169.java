@org.junit.Test
public void resolveTypeHandlerTypeHandlerAliasIsNull() {
    org.apache.ibatis.builder.BaseBuilder builder = new org.apache.ibatis.builder.BaseBuilder(new org.apache.ibatis.session.Configuration()) {
        {
        }
    };
    org.apache.ibatis.type.TypeHandler<?> typeHandler = builder.resolveTypeHandler(java.lang.String.class, ((java.lang.String) (null)));
    org.junit.Assert.assertThat(typeHandler, nullValue());
}