private boolean getUseColorBlind() {
    return configuration.getPropertyBool(org.esa.beam.framework.datamodel.ColorPaletteSchemes.PROPERTY_NAME_PALETTES_COLOR_BLIND_ENABLED, true);
}