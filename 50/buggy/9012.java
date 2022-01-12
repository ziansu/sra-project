@java.lang.Override
public void packet(com.nrkei.microservices.rapids_rivers.RapidsConnection connection, com.nrkei.microservices.rapids_rivers.Packet packet, com.nrkei.microservices.rapids_rivers.PacketProblems warnings) {
    assertFalse(warnings.hasErrors());
    assertEquals(0.0, json(packet.toJson()).get(Packet.READ_COUNT));
}