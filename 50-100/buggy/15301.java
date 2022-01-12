public void setLabels() {
    disclosurePanel.getHeaderTextAccessor().setText(loc.getMenu("Advanced"));
    btnBold.setText(loc.getMenu("Bold.Short"));
    btnItalic.setText(loc.getMenu("Italic.Short"));
    btnLatex.setText(loc.getPlain("LaTeXFormula"));
    btnSerif.setText("Serif");
    if ((advancedPanel) != null) {
        advancedPanel.setLabels();
    }
}