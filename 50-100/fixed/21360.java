@org.junit.Test
public void resolveTypeHandlerNoAssignable() {
    org.apache.ibatis.builder.BaseBuilder builder = new org.apache.ibatis.builder.BaseBuilder(new org.apache.ibatis.session.Configuration()) {
        {
        }
    };
    expectedException.expect(org.apache.ibatis.builder.BuilderException.class);
    expectedException.expectMessage(is("Type java.lang.Integer is not a valid TypeHandler because it does not implement TypeHandler interface"));
    builder.resolveTypeHandler(java.lang.String.class, "integer");
}