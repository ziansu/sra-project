private void setDiagnosisToDiagnosticReport(org.openmrs.module.fhir.mapper.bundler.DiagnosticReport diagnosticReport, org.openmrs.module.fhir.mapper.model.CompoundObservation compoundDiagnosticStudyObs) {
    org.openmrs.Obs diagnosisObs = compoundDiagnosticStudyObs.getMemberObsForConceptName(org.openmrs.module.fhir.mapper.bundler.MRS_CONCEPT_PROCEDURE_DIAGNOSIS);
    org.openmrs.module.fhir.mapper.bundler.Type codeableType = (diagnosisObs != null) ? obsValueMapper.map(diagnosisObs) : null;
    if ((codeableType != null) && (codeableType instanceof org.openmrs.module.fhir.mapper.bundler.CodeableConcept)) {
        org.openmrs.module.fhir.mapper.bundler.CodeableConcept codedDiagnosis = diagnosticReport.addCodedDiagnosis();
        org.openmrs.module.fhir.mapper.bundler.CodeableConcept codeableConcept = ((org.openmrs.module.fhir.mapper.bundler.CodeableConcept) (codeableType));
        codedDiagnosis.getCoding().addAll(codeableConcept.getCoding());
    }
}