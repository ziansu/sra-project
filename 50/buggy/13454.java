@org.junit.Test
public void createInstanceWithAbstractClass() {
    org.apache.ibatis.builder.BaseBuilder builder = new org.apache.ibatis.builder.BaseBuilder(new org.apache.ibatis.session.Configuration()) {
        {
        }
    };
    expectedException.expect(org.apache.ibatis.builder.BuilderException.class);
    expectedException.expectMessage(org.hamcrest.core.Is.is("Error creating instance. Cause: java.lang.InstantiationException: org.apache.ibatis.builder.BaseBuilder"));
    builder.createInstance("org.apache.ibatis.builder.BaseBuilder");
}