void call(GSM receiver, int duration) {
    if ((((duration > 0) && (hasSimCard)) && (receiver.hasSimCard)) && (!(simMobileNumber.equals(receiver.simMobileNumber)))) {
        outgoingCallsDuration += duration;
        lastOutgoingCall = new Call();
        lastOutgoingCall.caller = simMobileNumber;
        lastOutgoingCall.receiver = receiver.simMobileNumber;
        lastOutgoingCall.duration = duration;
        receiver.lastIncomingCall = new Call();
        receiver.lastIncomingCall.caller = simMobileNumber;
        receiver.lastIncomingCall.receiver = receiver.simMobileNumber;
        receiver.lastIncomingCall.duration = duration;
    }else {
        java.lang.System.out.println("Invalid Call");
    }
}