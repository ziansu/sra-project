@java.lang.Override
public void onIncomingCall(com.sinch.android.rtc.calling.CallClient callClient, com.sinch.android.rtc.calling.Call incomingCall) {
    call = incomingCall;
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), searchrescue.voip.IncomingCallActivity.class);
    intent.putExtra("CALL_ID", call.getCallId());
    CurrentCall.currentCall = call;
    startActivity(intent);
}