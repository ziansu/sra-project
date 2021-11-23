private void addDelay(eu.siacs.conversations.xmpp.stanzas.MessagePacket packet, long timestamp) {
    final java.text.SimpleDateFormat mDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
    mDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
    eu.siacs.conversations.xml.Element delay = packet.addChild("delay", "urn:xmpp:delay");
    java.util.Date date = new java.util.Date(timestamp);
    delay.setAttribute("stamp", mDateFormat.format(date));
}