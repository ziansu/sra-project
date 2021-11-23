private static org.sejda.impl.sambox.util.PDFont findFontAmong(org.sejda.sambox.pdmodel.PDDocument document, java.lang.String text, org.sejda.model.pdf.FontResource... fonts) {
    for (org.sejda.model.pdf.FontResource font : fonts) {
        org.sejda.impl.sambox.util.PDFont loaded = org.sejda.impl.sambox.util.FontUtils.loadFont(document, font);
        if (org.sejda.impl.sambox.util.FontUtils.canDisplay(text, loaded)) {
            org.sejda.impl.sambox.util.FontUtils.LOG.debug("Found suitable font {} to display '{}'", loaded, text);
            return loaded;
        }
    }
    return null;
}