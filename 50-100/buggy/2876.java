@java.lang.Override
public void run() {
    org.addhen.smssync.messages.ProcessSms process = new org.addhen.smssync.messages.ProcessSms(context);
    final java.lang.Long timeMills = java.lang.System.currentTimeMillis();
    org.addhen.smssync.models.Message message = new org.addhen.smssync.models.Message();
    message.setBody(org.addhen.smssync.controllers.DebugCallbacks.isServerOKRequest(context, sms.getOriginatingAddress()));
    message.setDate(new java.util.Date(timeMills));
    message.setPhoneNumber(sms.getOriginatingAddress());
    message.setUuid(process.getUuid());
    message.setType(Message.Type.TASK);
    process.sendSms(message);
}