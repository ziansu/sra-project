public ca.intelliagent.replayparser.packets.subtypes.SubPacketType getSubType() {
    return hasSubtype() ? subtype : fetchSubtype();
}