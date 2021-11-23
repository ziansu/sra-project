private void customizeStyleSheet(javax.swing.text.html.StyleSheet style, java.awt.Color fg) {
    final int fontSize = getMainWindow().getWizardFontSize();
    org.miradi.utils.HtmlUtilities.addRuleFontSize(style, getFont().getSize(), fontSize);
    org.miradi.utils.HtmlUtilities.addRuleFontFamily(style, getMainWindow().getDataPanelFontFamily());
    org.miradi.utils.HtmlUtilities.addFontColor(style, fg);
}