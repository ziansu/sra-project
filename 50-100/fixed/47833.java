private void parseCallState(java.lang.String callId, java.lang.String newState, java.util.Map<java.lang.String, java.lang.String> callDetails) {
    int callState = cx.ring.model.SipCall.stateFromString(newState);
    cx.ring.model.SipCall sipCall = currentCalls.get(callId);
    if (sipCall != null) {
        sipCall.setCallState(callState);
        sipCall.setDetails(callDetails);
    }
}