@org.junit.Test
public void testPeerCompareByIsSecure() throws java.lang.Exception {
    org.apache.nifi.android.sitetosite.client.peer.Peer peer1 = new org.apache.nifi.android.sitetosite.client.peer.Peer("hostname", 443, 6000, true, 0, 1000L);
    org.apache.nifi.android.sitetosite.client.peer.Peer peer2 = new org.apache.nifi.android.sitetosite.client.peer.Peer("hostname", 443, 6000, false, 0, 1000L);
    org.junit.Assert.assertEquals((-1), peer1.compareTo(peer2));
    org.junit.Assert.assertEquals(1, peer2.compareTo(peer1));
}