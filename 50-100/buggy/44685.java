private static java.lang.String buildNshMapKey(final java.lang.Long nsp, final java.lang.Short nsi, final java.lang.Long mappedNsp, final java.lang.Short mappedNsi) {
    return new java.lang.String(((((((("nsh_map_" + (nsp.toString())) + "_") + (nsi.toString())) + "_to_") + (mappedNsp.toString())) + "_") + (mappedNsi.toString())));
}