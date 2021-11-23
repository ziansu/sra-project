private void parseCoordinateMetadata(com.fasterxml.jackson.core.JsonParser jp) throws java.io.IOException {
    jp.nextToken();
    jp.nextToken();
    jp.nextToken();
    if ((jp.getCurrentToken()) == (com.fasterxml.jackson.core.JsonToken.END_ARRAY)) {
    }else {
        jp.nextToken();
    }
    jp.nextToken();
}