@java.lang.Override
public void handleComponent(com.myselia.javacommon.communication.units.Transmission t) throws java.io.IOException {
    java.lang.System.out.println("[Component Handler] ~~ Handling stuff");
    java.lang.System.out.println(("\t[Transmission] --> " + (t.toString())));
    mailbox.enqueueIn(t);
    transmissionReceived();
}