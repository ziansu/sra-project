private void setHovered(java.lang.String elementId) {
    if (((hovered) != null) && ((hovered) != (selected))) {
        hovered.removeAttribute(SVGConstants.SVG_FILTER_ATTRIBUTE);
    }
    if (elementId != null) {
        org.reactome.web.diagram.util.svg.thumbnail.OMElement newHovered = svg.getElementById(elementId);
        if ((newHovered != null) && (newHovered != (selected))) {
            newHovered.setAttribute(SVGConstants.SVG_FILTER_ATTRIBUTE, org.vectomatic.dom.svg.utils.DOMHelper.toUrl(org.reactome.web.diagram.util.svg.thumbnail.HOVERING_OVERLAY_FILTER));
            hovered = newHovered;
        }
    }
    applyCTM(false);
}