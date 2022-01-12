private org.verapdf.model.pdlayer.PDCIDFont getDescendantFont() {
    org.verapdf.cos.COSDictionary cidFontDict = ((org.verapdf.model.pdlayer.PDType0Font) (this.pdFont)).getDescendantFont();
    if (cidFontDict != null) {
        org.verapdf.model.pdlayer.PDCIDFont cidFont = new org.verapdf.model.pdlayer.PDCIDFont(cidFontDict);
        org.verapdf.model.pdlayer.PDCIDFont pdCIDFont = new org.verapdf.model.impl.pd.font.GFPDCIDFont(cidFont, renderingMode);
        return pdCIDFont;
    }
    return null;
}