private void broadcastMyPresence(java.lang.String id) {
    org.jivesoftware.smack.packet.Presence presence = createPresence();
    presence.setFrom(mConnection.getUser());
    android.content.Intent i = org.kontalk.service.msgcenter.PresenceListener.createIntent(this, presence);
    i.putExtra(org.kontalk.service.msgcenter.MessageCenterService.EXTRA_FINGERPRINT, getMyFingerprint());
    i.putExtra(org.kontalk.service.msgcenter.MessageCenterService.EXTRA_SUBSCRIBED_FROM, true);
    i.putExtra(org.kontalk.service.msgcenter.MessageCenterService.EXTRA_SUBSCRIBED_TO, true);
    i.putExtra(org.kontalk.service.msgcenter.MessageCenterService.EXTRA_PACKET_ID, id);
    mLocalBroadcastManager.sendBroadcast(i);
}