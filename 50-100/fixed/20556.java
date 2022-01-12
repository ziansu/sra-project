public void setActiveProject(edu.stanford.protege.metaproject.api.ProjectId projectId, org.protege.editor.owl.server.versioning.api.VersionedOWLOntology versionOntology) {
    registerProject(versionOntology.getOntology().getOntologyID(), projectId);
    registerVersionOntology(versionOntology.getOntology().getOntologyID(), versionOntology);
    getEditorKit().getOWLModelManager().setActiveOntology(versionOntology.getOntology());
}