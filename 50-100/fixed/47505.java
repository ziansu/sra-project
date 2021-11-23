public static void main(java.lang.String[] args) {
    boolean cacheIRLResults = false;
    commands.amdp.experiments.cleanupL0.CleanupL0ControllerConstructor l0Controller = new commands.amdp.experiments.cleanupL0.CleanupL0ControllerConstructor();
    commands.amdp.experiments.cleanupL1.CleanupL1ControllerConstructor l1Controller = new commands.amdp.experiments.cleanupL1.CleanupL1ControllerConstructor();
    commands.amdp.experiments.cleanupL2.CleanupL2ControllerConstructor l2Controller = new commands.amdp.experiments.cleanupL2.CleanupL2ControllerConstructor();
    if (cacheIRLResults) {
    }
    commands.amdp.experiments.CleanupAMDPExperiment.LOOTest(l2Controller, l2Controller.EXPERTDATASET, commands.amdp.experiments.CleanupAMDPExperiment.L2_TRAJ_CACHE);
}