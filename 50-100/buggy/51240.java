public static void printTreatmentComparison(java.util.HashMap<laurin.TreatmentAnalyzer, java.lang.String> treatments) {
    java.util.ArrayList<laurin.TreatmentAnalyzer> treatmentAnalyzers = new java.util.ArrayList<laurin.TreatmentAnalyzer>();
    for (java.util.Map.Entry<laurin.TreatmentAnalyzer, java.lang.String> treatment : treatments.entrySet()) {
        treatmentAnalyzers.add(treatment.getKey());
        treatment.getKey().setTitle(treatment.getValue());
    }
    laurin.TreatmentAnalyzer.printTreatmentComparison(treatmentAnalyzers, false);
}