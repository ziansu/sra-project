public void addVariant(java.lang.String variantName, java.util.HashMap<java.lang.String, java.lang.String> variantTags) {
    pl.woofla.taghandler.business.WordUnitVariant variant = new pl.woofla.taghandler.business.WordUnitVariant(variantTags, variantName);
    pl.woofla.taghandler.backend.WordbaseXMLHandler.addVariantToWordUnit(variant, this);
}