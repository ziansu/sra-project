public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.io.File dataDirectory = new java.io.File("/home/tseytlin/Work/EDDA/edda/pico/data");
    java.io.File seedTerminology = new java.io.File(dataDirectory, "OrganTransplant.txt");
    java.io.File outputOntology = new java.io.File(dataDirectory, "OrganTransplant.owl");
    java.io.File templateFile = new java.io.File(dataDirectory, "OrganTransplant.template");
    edu.pitt.dbmi.edda.pico.tools.DomainTemplateCreator.createDomainTemplate(outputOntology, templateFile);
}