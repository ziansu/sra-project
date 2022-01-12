@java.lang.Override
public java.lang.Integer answer(final org.mockito.invocation.InvocationOnMock invocation) throws java.lang.Throwable {
    byte[] buffer = ((byte[]) (invocation.getArguments()[0]));
    for (int i = 0; i < (stream.length); i++) {
        buffer[i] = stream[i];
    }
    return 2;
}