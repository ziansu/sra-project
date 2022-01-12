@org.junit.Test
public void mismatch() {
    org.mockito.BDDMockito.given(mock.simpleMethod(2)).willReturn("");
    mock.simpleMethod(3);
}