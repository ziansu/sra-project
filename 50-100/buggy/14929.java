private java.lang.String createHeader(org.cy3sbml.gui.SBase item) {
    java.lang.String className = org.cy3sbml.util.SBMLUtil.getUnqualifiedClassName(item);
    java.lang.String header = java.lang.String.format("<h2>%s</h2>", className);
    if (org.cy3sbml.gui.NamedSBase.class.isAssignableFrom(item.getClass())) {
        org.cy3sbml.gui.NamedSBase nsb = ((org.cy3sbml.gui.NamedSBase) (item));
        header = java.lang.String.format("<h2>%s <small>%s</small></h2>", className, nsb.getId());
        if (nsb.isSetName()) {
            header += java.lang.String.format("<h2><small>%s</small></h2>", nsb.getName);
        }
    }
    return header;
}