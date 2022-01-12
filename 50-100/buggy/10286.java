@org.junit.Before
public void setup() throws java.lang.Exception {
    this.method = org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolverTests.class.getDeclaredMethod("handle", org.springframework.messaging.Message.class, org.springframework.messaging.Message.class, org.springframework.messaging.Message.class, org.springframework.messaging.Message.class, org.springframework.messaging.support.ErrorMessage.class);
    this.converter = org.mockito.Mockito.mock(org.springframework.messaging.converter.MessageConverter.class);
    this.resolver = new org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver(this.converter);
}