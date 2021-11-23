public void run() {
    try {
        util.AnalyzeCamera.determineTargets(subsystems.DriveTrainAutonHelper.cam.getImage());
        deepAnalyze(subsystems.DriveTrainAutonHelper.targets, util.AnalyzeCamera.getImageWidth());
    } catch (edu.wpi.first.wpilibj.image.NIVisionException e) {
        e.printStackTrace();
    }
}