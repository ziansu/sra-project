@java.lang.Override
public final org.jivesoftware.smack.util.XmlStringBuilder toXML() {
    org.jivesoftware.smack.util.XmlStringBuilder xml = new org.jivesoftware.smack.util.XmlStringBuilder(this);
    addExtraAttributes(xml);
    if ((candidates.isEmpty()) && (infos.isEmpty())) {
        xml.closeEmptyElement();
    }else {
        xml.rightAngleBracket();
        xml.append(candidates);
        xml.optElement(info);
        xml.closeElement(this);
    }
    return xml;
}