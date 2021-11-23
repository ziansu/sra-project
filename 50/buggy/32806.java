public void run() {
    java.lang.String templateFileLocation = template_model.diagram.util.AutoGenCTSettings.retrieveTemplateFileLocation();
    clonepedia.codegeneration.diagram.bean.DesignList designs = clonepedia.templategeneration.routine.DesignXMLReader.xml2design(templateFileLocation);
    template_model.diagram.util.AutoGenCTSettings.designs = designs;
    printTemplateMetrics(designs);
    viewer.setInput(AutoGenCTSettings.designs);
    viewer.refresh();
}