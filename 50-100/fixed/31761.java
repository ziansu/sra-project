private org.opencb.cellbase.mongodb.db.variation.ConsequenceType findCodingOverlappingConsequenceType(org.opencb.cellbase.mongodb.db.variation.ConsequenceType consequenceType, java.util.List<org.opencb.cellbase.mongodb.db.variation.ConsequenceType> consequenceTypeList) {
    for (org.opencb.cellbase.mongodb.db.variation.ConsequenceType consequenceType1 : consequenceTypeList) {
        if (((isCoding(consequenceType1)) && (consequenceType.getEnsemblTranscriptId().equals(consequenceType1.getEnsemblTranscriptId()))) && (consequenceType.getProteinVariantAnnotation().getPosition().equals(consequenceType1.getProteinVariantAnnotation().getPosition()))) {
            return consequenceType1;
        }
    }
    return null;
}