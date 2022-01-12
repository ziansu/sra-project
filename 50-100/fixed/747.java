private void doSubjectDiff() {
    for (org.semanticweb.owlapi.model.OWLAnnotationSubject as : allSubjects) {
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> oldAxioms = git.owl.driver.OwlUtil.getAxioms(as, oldOntology);
        oldAxiomsToProcess.removeAll(oldAxioms);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> newAxioms = git.owl.driver.OwlUtil.getAxioms(as, newOntology);
        newAxiomsToProcess.removeAll(newAxioms);
        if (common.isUseSubject(as)) {
            compareAxioms(oldAxioms, newAxioms, as);
        }
    }
}