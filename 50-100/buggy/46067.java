private org.verapdf.model.pdlayer.PDCIDFont getDescendantFont() {
    org.verapdf.cos.COSDictionary cidFontDict = ((org.verapdf.model.pdlayer.PDType0Font) (this.pdFont)).getDescendantFont();
    if (cidFontDict != null) {
        org.verapdf.model.pdlayer.PDCIDFont cidFont = new org.verapdf.model.pdlayer.PDCIDFont(cidFontDict);
        org.verapdf.model.pdlayer.PDCIDFont pdCIDFont = new org.verapdf.model.impl.pd.font.GFPDCIDFont(cidFont, renderingMode);
        java.util.List<org.verapdf.model.pdlayer.PDCIDFont> list = new java.util.ArrayList(MAX_NUMBER_OF_ELEMENTS);
        list.add(pdCIDFont);
        return null;
    }
    return null;
}