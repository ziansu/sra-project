private void substituteInferredRelationships() throws java.lang.Exception {
    org.ihtsdo.snomed.util.rf2.Concept.ensureParents(Relationship.CHARACTERISTIC.STATED);
    org.ihtsdo.snomed.util.rf2.Concept.ensureParents(Relationship.CHARACTERISTIC.INFERRED);
    findReplacements();
    reportProgress();
    outputFile(true);
    outputFile(false);
    reportFailures();
}