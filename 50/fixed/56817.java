@org.junit.Test
public void used() {
    org.mockito.BDDMockito.given(mock.simpleMethod(1)).willReturn("");
    mock.simpleMethod(1);
}