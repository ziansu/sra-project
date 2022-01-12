public void expectInvocations(int n) {
    assertEquals(0, counter.get());
    counter.set(n);
}