private void appendColormapData(cz.fidentis.controller.data.ColormapConfig data, org.w3c.dom.Element parent) {
    org.w3c.dom.Element colorE = parent.getOwnerDocument().createElement("colormapData");
    parent.appendChild(colorE);
    colorE.setAttribute("haussdorfMaxTreshold", java.lang.String.valueOf(data.getHausdorfMaxTreshold()));
    colorE.setAttribute("haussdorfMinTreshold", java.lang.String.valueOf(data.getHausdorfMinTreshold()));
    colorE.setAttribute("colorScheme", java.lang.String.valueOf(data.getUsedColorScheme()));
}