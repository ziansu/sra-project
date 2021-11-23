public com.hp.hpl.jena.ontology.OntModel doNewModel() {
    javax.faces.context.FacesContext facesContext = javax.faces.context.FacesContext.getCurrentInstance();
    javax.servlet.ServletContext scontext = ((javax.servlet.ServletContext) (facesContext.getExternalContext().getContext()));
    java.lang.String filePath = scontext.getRealPath("/ontology/");
    java.nio.file.Path pathLdwpo = java.nio.file.Paths.get(filePath, "modelo.owl");
    com.hp.hpl.jena.ontology.OntModel model = com.hp.hpl.jena.rdf.model.ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
    model.read(pathLdwpo.toUri().toString(), "");
    return model;
}