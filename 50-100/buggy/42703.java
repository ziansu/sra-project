public static void checkAtLeastNumberOfInvocations(java.util.List<org.mockito.invocation.Invocation> invocations, org.mockito.invocation.MatchableInvocation wanted, int wantedCount) {
    java.util.List<org.mockito.invocation.Invocation> actualInvocations = org.mockito.internal.invocation.InvocationsFinder.findInvocations(invocations, wanted);
    int actualCount = actualInvocations.size();
    if (wantedCount > actualCount) {
        org.mockito.invocation.Location lastLocation = org.mockito.internal.invocation.InvocationsFinder.getLastLocation(actualInvocations);
        throw org.mockito.internal.exceptions.Reporter.tooLittleActualInvocations(new org.mockito.internal.verification.checkers.AtLeastDiscrepancy(wantedCount, actualCount), wanted, lastLocation);
    }
    org.mockito.internal.verification.checkers.AtLeastXNumberOfInvocationsChecker.removeAlreadyVerified(actualInvocations);
    org.mockito.internal.invocation.InvocationMarker.markVerified(actualInvocations, wanted);
}