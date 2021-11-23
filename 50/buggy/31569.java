public void addReferenceBy(java.lang.String referredPatientId, java.lang.String referredRelationship) {
    logger.error("Adding referred by {} (type: {})", referredPatientId, referredRelationship);
    referredBy.put(referredPatientId, referredRelationship);
}