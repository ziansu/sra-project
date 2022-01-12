@org.junit.Test
public void testWithDefaults() {
    assertNull(webhook.getParallelCalls());
    assertNull(webhook.getBatch());
    webhook = webhook.withDefaults();
    assertEquals(1L, ((long) (webhook.getParallelCalls())));
    assertEquals("SINGLE", webhook.getBatch());
}