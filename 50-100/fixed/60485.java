public java.lang.String getTreatmentAssignmentDroolsFilePath(java.lang.String treatmentArmId, java.lang.String stratumId, java.lang.String version) {
    java.lang.String key = new java.lang.StringBuilder().append(treatmentArmId).append('_').append(stratumId).append('_').append(version).toString();
    return (treatmentAssignmentDroolsFileMapping.containsKey(key)) && ((treatmentAssignmentDroolsFileMapping.get(key)) != null) ? treatmentAssignmentDroolsFileMapping.get(key) : defaultTreatmentAssignmentDroolsFilePath;
}