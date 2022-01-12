public java.util.Map<java.lang.String, java.lang.String> getColorSwatch() {
    java.util.Map<java.lang.String, java.lang.String> swatch = new java.util.LinkedHashMap<java.lang.String, java.lang.String>();
    for (dk.i2m.converge.core.Color color : dk.i2m.converge.core.Color.values()) {
        swatch.put(i18n.getString(("Generic_COLOR_" + (color.name()))), color.name());
    }
    return swatch;
}