protected static java.lang.String polyCoordsToWKT(java.lang.String polyCoords) {
    java.lang.String footprintWKT = null;
    if (org.apache.commons.lang3.StringUtils.isNotBlank(polyCoords)) {
        footprintWKT = "POLYGON" + (polyCoords.replace(" ", "").replace(",", " ").replace(") (", "),("));
    }
    return footprintWKT;
}