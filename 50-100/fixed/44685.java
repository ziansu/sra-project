private static java.lang.String buildNshMapKey(final java.lang.Long nsp, final java.lang.Short nsi, final java.lang.Long mappedNsp, final java.lang.Short mappedNsi) {
    return (((((("nsh_map_" + nsp) + "_") + nsi) + "_to_") + mappedNsp) + "_") + mappedNsi;
}