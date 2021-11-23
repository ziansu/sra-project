public void fixRangeField(hatemile.util.HTMLDOMElement rangeField) {
    if (rangeField.hasAttribute("min")) {
        rangeField.setAttribute("aria-valuemin", rangeField.getAttribute("min"));
    }
    if (rangeField.hasAttribute("max")) {
        rangeField.setAttribute("aria-valuemax", rangeField.getAttribute("max"));
    }
}