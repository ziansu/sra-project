@mockit.Test
public void recordSameInvocationInNotStrictExpectationBlockThenInStrictOne() {
    thrown.handleAssertionErrors();
    thrown.expect(java.lang.AssertionError.class);
    new mockit.Expectations() {
        {
            mock.value();
            result = 1;
        }
    };
    new mockit.StrictExpectations() {
        {
            mock.value();
            result = 2;
        }
    };
    assertEquals(1, mock.value());
    assertEquals(1, mock.value());
}