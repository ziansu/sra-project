@java.lang.Override
public edu.bu.vip.kinect.controller.calibration.Protos.Calibration createCalibration(edu.bu.vip.kinect.controller.calibration.Protos.Calibration calibration) {
    java.util.Random rand = new java.util.Random();
    long newId = java.lang.Math.abs(rand.nextInt());
    while (calibrationExists(newId)) {
        newId = java.lang.Math.abs(rand.nextInt());
    } 
    edu.bu.vip.kinect.controller.calibration.Protos.Calibration.Builder builder = calibration.toBuilder();
    builder.setId(newId);
    builder.setDateCreated(edu.bu.vip.multikinect.util.TimestampUtils.now());
    edu.bu.vip.kinect.controller.calibration.Protos.Calibration result = builder.build();
    saveCalibration(result);
    return result;
}