@java.lang.Override
public void execute(final java.lang.Object message) throws java.lang.Exception {
    org.restcomm.connect.mscontrol.api.messages.CreateMediaSession createMediaSession = ((org.restcomm.connect.mscontrol.api.messages.CreateMediaSession) (message));
    java.lang.String conferenceName = createMediaSession.conferenceName();
    mrb.tell(new org.restcomm.connect.mrb.api.GetMediaGateway(createMediaSession.callSid(), conferenceName, null), self());
}