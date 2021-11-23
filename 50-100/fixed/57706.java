public void createInfo() {
    if ((sbase) == null) {
        return ;
    }
    info = java.lang.String.format(org.cy3sbml.gui.SBaseHTMLFactory.HTML_START_TEMPLATE, org.cy3sbml.gui.SBaseHTMLFactory.baseDir);
    info += createHeader(sbase);
    info += createSBase(sbase);
    info += createSBO(sbase);
    info += createCVTerms(sbase);
    info += createAnnotation(sbase);
    info += createNotes(sbase);
    info += org.cy3sbml.gui.SBaseHTMLFactory.HTML_STOP_TEMPLATE;
}