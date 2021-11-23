public void sendGeolocation(org.jivesoftware.smackx.geoloc.packet.GeoLocation geoLocation) {
    try {
        getNode().send(new org.jivesoftware.smackx.pubsub.PayloadItem<org.jivesoftware.smackx.geoloc.packet.GeoLocation>(geoLocation));
    } catch (org.jivesoftware.smack.SmackException.NoResponseException | org.jivesoftware.smack.XMPPException.XMPPErrorException | org.jivesoftware.smack.SmackException.NotConnectedException | java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}