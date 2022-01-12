@java.lang.Override
public org.jivesoftware.smackx.json.packet.AbstractJsonPacketExtension parse(org.xmlpull.v1.XmlPullParser parser, int initialDepth) throws java.io.IOException, org.jivesoftware.smack.SmackException, org.xmlpull.v1.XmlPullParserException {
    java.lang.String json = org.jivesoftware.smack.util.PacketParserUtils.parseElementText(parser);
    return from(json);
}