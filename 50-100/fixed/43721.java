public static java.lang.String getIQXML(org.jxmpp.jid.FullJid from, org.jxmpp.jid.FullJid to, java.lang.String stanzaId, java.lang.String jingleXML) {
    return ((((((("<iq from='" + from) + "' id='") + stanzaId) + "' to='") + to) + "' type='set'>") + jingleXML) + "</iq>";
}