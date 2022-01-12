private java.util.List<org.naima.service.diagnostic.domain.Symptom> findExclusiveSymptoms(org.naima.service.diagnostic.domain.AssociatedSymptomsRule rule, java.util.Set<java.lang.String> excludeIds) {
    java.util.List<org.naima.service.diagnostic.domain.Symptom> symptoms = new java.util.ArrayList<org.naima.service.diagnostic.domain.Symptom>();
    for (java.lang.String symptomKey : rule.getConsequent()) {
        if (excludeIds.contains(symptomKey))
            continue;
        
        org.naima.service.diagnostic.domain.Symptom symptom = symptomRepository.findById(symptomKey);
        symptoms.add(symptom);
    }
    return symptoms;
}