public static void main(java.lang.String[] args) {
    edu.drexel.psal.jstylo.generics.FullAPI test = new edu.drexel.psal.jstylo.generics.FullAPI.Builder().cfdPath("./jsan_resources/feature_sets/writeprints_feature_set_limited.xml").psPath("C:/Users/Mordio/Documents/GitHub/jstylo/jsan_resources/problem_sets/enron_verify_meta.xml").classifierPath("weka.classifiers.functions.SMO").numThreads(4).analysisType(edu.drexel.psal.jstylo.generics.FullAPI.analysisType.TRAIN_TEST_KNOWN).useDocTitles(true).build();
    test.prepareInstances();
    edu.drexel.psal.jstylo.generics.Verifier v = new edu.drexel.psal.jstylo.verifiers.DistractorlessVerifier(test.getTrainingInstances(), test.getTestInstances(), false);
    v.verify();
    java.lang.System.out.println(v.getResultString());
}