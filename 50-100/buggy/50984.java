public static void addClassName(org.reactome.web.diagram.util.svg.OMElement element, java.lang.String className) {
    if (element != null) {
        java.lang.String classAtr = element.getAttribute(SVGConstants.SVG_CLASS_ATTRIBUTE);
        if (!(classAtr.contains(className))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(classAtr);
            sb.append(" ").append(className);
            element.setAttribute(SVGConstants.SVG_CLASS_ATTRIBUTE, sb.toString());
        }
    }
}