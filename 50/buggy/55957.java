@java.lang.Override
public java.lang.String getPrefix() {
    final org.exist.dom.QName nodeName = org.exist.dom.persistent.NodeImpl.getQName();
    final java.lang.String prefix = nodeName.getPrefix();
    return prefix == null ? javax.xml.XMLConstants.DEFAULT_NS_PREFIX : prefix;
}