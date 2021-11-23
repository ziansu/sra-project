@java.lang.Override
public com.microsoft.dhalion.diagnoser.Diagnosis diagnose(java.util.List<com.microsoft.dhalion.detector.Symptom> symptoms) {
    java.util.List<com.microsoft.dhalion.detector.Symptom> backPressureSymptoms = findSymptomsByName(symptoms, com.twitter.heron.healthmgr.diagnosers.BACK_PRESSURE);
    java.util.List<com.microsoft.dhalion.detector.Symptom> bufferGrowthSymptoms = findSymptomsByName(symptoms, com.twitter.heron.healthmgr.diagnosers.GROWING_BUFFER);
    if (backPressureSymptoms.isEmpty()) {
        return bufferGrowthDiagnosisHelper(bufferGrowthSymptoms);
    }else
        if ((backPressureSymptoms.size()) == 1) {
            return backPressureDiagnosisHelper(backPressureSymptoms);
        }else {
            throw new java.lang.IllegalStateException("Multiple back-pressure symptoms case");
        }
    
}