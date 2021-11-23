public ca.intelliagent.replayparser.packets.subtypes.SubPacketType getSubType() {
    fetchSubtype();
    return hasSubtype() ? subtype : fetchSubtype();
}