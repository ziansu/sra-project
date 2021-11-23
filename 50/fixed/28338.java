private org.opencb.biodata.models.variant.avro.ConsequenceType getConsequenceType(java.util.List<org.opencb.biodata.models.variant.avro.ConsequenceType> consequenceTypeList, java.lang.String transcriptId) {
    for (org.opencb.biodata.models.variant.avro.ConsequenceType consequenceType : consequenceTypeList) {
        if (transcriptId.equals(consequenceType.getEnsemblTranscriptId())) {
            return consequenceType;
        }
    }
    return null;
}