private void doSubjectDiff() {
    for (org.semanticweb.owlapi.model.OWLAnnotationSubject as : allSubjects) {
        if (common.isUseSubject(as)) {
            java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> oldAxioms = git.owl.driver.OwlUtil.getAxioms(as, oldOntology);
            oldAxiomsToProcess.removeAll(oldAxioms);
            java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> newAxioms = git.owl.driver.OwlUtil.getAxioms(as, newOntology);
            newAxiomsToProcess.removeAll(newAxioms);
            compareAxioms(oldAxioms, newAxioms);
        }
    }
}