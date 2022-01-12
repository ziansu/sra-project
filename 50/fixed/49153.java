@org.junit.Test
public final void testOnApplicationEvent() {
    testService.init();
    testService.onApplicationEvent(new org.springframework.context.event.ContextClosedEvent(new org.springframework.context.support.GenericApplicationContext()));
}