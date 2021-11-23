@java.lang.Override
public void onChange() {
    if ((typebasedCommitInvocations.getAndIncrement()) == 0) {
        assertTrue(dogs.isValid());
        assertEquals(0, dogs.size());
    }else {
        fail("This listener should only be called once.");
    }
}