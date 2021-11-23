@java.lang.Override
public java.util.List<java.lang.Class<? extends org.adligo.tests4j.system.shared.trials.I_Trial>> getTrials() {
    java.util.List<java.lang.Class<? extends org.adligo.tests4j.system.shared.trials.I_Trial>> trials = new java.util.ArrayList<java.lang.Class<? extends org.adligo.tests4j.system.shared.trials.I_Trial>>();
    trials.addAll(new org.adligo.fabricate_tests.common.A_CommonPkgTrials().getTrials());
    trials.addAll(new org.adligo.fabricate_tests.files.A_FilesTrials().getTrials());
    trials.add(org.adligo.fabricate_tests.FabPackagesTrial.class);
    return trials;
}