public org.gbif.validation.api.model.RecordEvaluationResult.Builder addBaseDetail(org.gbif.validation.api.model.EvaluationType evaluationType, java.lang.String expected, java.lang.String found) {
    if ((details) == null) {
        details = new java.util.ArrayList<>();
    }
    details.add(new org.gbif.validation.api.model.RecordEvaluationResult.BaseEvaluationResultDetails(lineNumber, recordId, evaluationType, expected, found));
    return this;
}