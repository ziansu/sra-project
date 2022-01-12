@java.lang.Override
public boolean accept(org.jitsi.jicofo.recording.jibri.Packet packet) {
    boolean accept = ((packet instanceof org.jitsi.jicofo.recording.jibri.IQ) && ((currentJibriJid) != null)) && ((packet.getFrom().equals(currentJibriJid)) || (((packet.getFrom()) + "/").startsWith(currentJibriJid)));
    return accept;
}