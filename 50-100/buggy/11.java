public static javafx.scene.control.Tooltip createTooltip(java.lang.String text, boolean wrap, double maxWidth, double maxHeight) {
    javafx.scene.control.Tooltip tip = new javafx.scene.control.Tooltip(text);
    tip.setWrapText(true);
    tip.setMaxWidth(maxWidth);
    tip.setMaxHeight(maxHeight);
    return tip;
}