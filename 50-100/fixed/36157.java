private static java.util.Set<java.lang.String> getIcd10ExternalCauseCodes() {
    final java.util.Set<java.lang.String> externalCauseCodes = new java.util.HashSet<>();
    externalCauseCodes.addAll(org.ihtsdo.otf.mapping.jpa.handlers.ICD10ProjectSpecificAlgorithmHandler.getIcd10AdverseEffectPoisoningCodes());
    externalCauseCodes.addAll(org.ihtsdo.otf.mapping.jpa.handlers.ICD10ProjectSpecificAlgorithmHandler.getIcd10IntentionalPoisoningCodes());
    externalCauseCodes.addAll(org.ihtsdo.otf.mapping.jpa.handlers.ICD10ProjectSpecificAlgorithmHandler.getIcd10UndeterminedPoisoningCodes());
    externalCauseCodes.addAll(org.ihtsdo.otf.mapping.jpa.handlers.ICD10ProjectSpecificAlgorithmHandler.getIcd10AccidentalPoisoningCodes());
    return externalCauseCodes;
}