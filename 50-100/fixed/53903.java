@java.lang.Override
public void setFileWriteMode(int filewritemode) throws java.lang.Exception {
    gda.device.detector.areadetector.v17.impl.NDFileImpl.logger.info(("Setting file-write-mode to: " + filewritemode));
    try {
        if ((config) != null) {
            gda.device.detector.areadetector.v17.impl.NDFileImpl.EPICS_CONTROLLER.caputWait(createChannel(config.getFileWriteMode().getPv()), filewritemode);
        }else {
            gda.device.detector.areadetector.v17.impl.NDFileImpl.EPICS_CONTROLLER.caputWait(getChannel(gda.device.detector.areadetector.v17.impl.NDFileImpl.FileWriteMode), filewritemode);
        }
    } catch (java.lang.Exception ex) {
        gda.device.detector.areadetector.v17.impl.NDFileImpl.logger.error("Cannot setFileWriteMode", ex);
        throw ex;
    }
}