protected void writeMobileNetworkCode(final java.lang.String mobileNetworkCode, final com.thoughtworks.xstream.io.HierarchicalStreamWriter writer) {
    if (mobileNetworkCode != null) {
        writer.startNode("MobileNetworkCode");
        writer.setValue(mobileNetworkCode.toString());
        writer.endNode();
    }
}