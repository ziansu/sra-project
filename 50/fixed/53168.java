public java.lang.String getFoundSentence(java.lang.String add) {
    java.lang.String label = zildo.fwk.ui.UIText.getGameText((("automatic." + (name())) + add));
    if (label.startsWith("automatic.")) {
        return null;
    }
    return label;
}