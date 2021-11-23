@org.junit.Test
public void bindWhenIgnoringErrorsShouldBind() throws java.lang.Exception {
    this.thrown.expect(org.springframework.boot.context.properties.bind.BindException.class);
    org.springframework.boot.context.properties.bind.handler.IgnoreErrorsBindHandlerTests.Example bound = this.binder.bind("example", org.springframework.boot.context.properties.bind.Bindable.of(org.springframework.boot.context.properties.bind.handler.IgnoreErrorsBindHandlerTests.Example.class), new org.springframework.boot.context.properties.bind.handler.IgnoreErrorsBindHandler());
    org.assertj.core.api.Assertions.assertThat(bound.getFoo()).isEqualTo(0);
}