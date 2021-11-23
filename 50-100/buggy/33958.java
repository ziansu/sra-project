private void writeNativeObject(final com.google.openrtb.OpenRtb.BidRequest.Imp.Native aNativ, final com.fasterxml.jackson.core.JsonGenerator aGen) throws java.io.IOException {
    if (useNativeAsObject()) {
        aGen.writeFieldName("request");
        final com.google.openrtb.json.OpenRtbNativeJsonWriter nativeWriterRef = new com.google.openrtb.json.OpenRtbNativeJsonWriter(factory());
        nativeWriterRef.writeNativeRequest(aNativ.getRequestNative(), aGen);
    }else {
        aGen.writeStringField("request", nativeWriter().writeNativeRequest(aNativ.getRequestNative()));
    }
}