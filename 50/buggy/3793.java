protected void writeLastGeolocationResponse(final java.lang.Boolean lastGeolocationResponse, final com.thoughtworks.xstream.io.HierarchicalStreamWriter writer) {
    if (lastGeolocationResponse != null) {
        writer.startNode("LastGeolocationResponse");
        writer.setValue(lastGeolocationResponse.toString());
        writer.endNode();
    }
}