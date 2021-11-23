@org.junit.Test
public void mustParseCreatedPacket() {
    com.offbynull.portmapper.natpmp.messages.UdpMappingNatPmpRequest origReq = new com.offbynull.portmapper.natpmp.messages.UdpMappingNatPmpRequest(61938, 62452, 4294967295L);
    byte[] buffer = origReq.dump();
    com.offbynull.portmapper.natpmp.messages.UdpMappingNatPmpRequest parsedReq = new com.offbynull.portmapper.natpmp.messages.UdpMappingNatPmpRequest(buffer);
    org.junit.Assert.assertEquals(1, parsedReq.getOp());
    org.junit.Assert.assertEquals(61938, parsedReq.getInternalPort());
    org.junit.Assert.assertEquals(62452, parsedReq.getSuggestedExternalPort());
    org.junit.Assert.assertEquals(4294967295L, parsedReq.getLifetime());
}