@org.junit.Test
public void used() {
    java.lang.System.out.println("working");
    org.mockito.BDDMockito.given(mock.simpleMethod(1)).willReturn("");
    mock.simpleMethod(1);
}