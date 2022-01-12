@java.lang.Override
public java.lang.Object answer(org.mockito.invocation.InvocationOnMock invocation) throws java.lang.Throwable {
    int argumentPosition = inferWantedArgumentPosition(invocation);
    validateIndexWithinInvocationRange(invocation, argumentPosition);
    if (wantedArgIndexIsVarargAndSameTypeAsReturnType(invocation.getMethod(), argumentPosition)) {
        return ((org.mockito.invocation.Invocation) (invocation)).getRawArguments()[argumentPosition];
    }else {
        return invocation.getArgument(argumentPosition);
    }
}