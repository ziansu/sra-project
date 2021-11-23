private <TGeo extends de.k3b.geo.api.GeoPointDto> TGeo getYandexUri(java.lang.String uri, TGeo parseResult) {
    java.lang.String search = "map=";
    int dataStart = contentIndexBehind(uri, "ll=");
    java.lang.String[] parts = getParts(uri, dataStart, "[,?&]", 2);
    if (parts != null) {
        de.k3b.geo.io.GeoUri.setLatLonZoom(parseResult, parts[1], parts[0], null);
    }
    return uriParamParse(uri, parseResult);
}