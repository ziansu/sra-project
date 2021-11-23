private void logMotionState(java.util.EnumSet<teaselib.core.devices.motiondetection.Presence> indicators, boolean contourMotionDetected, boolean trackerMotionDetected) {
    teaselib.TeaseLib.instance().log.info(indicators.toString());
    teaselib.TeaseLib.instance().log.info((((((("contourMotionDetected=" + contourMotionDetected) + "  trackerMotionDetected=") + trackerMotionDetected) + "(distance=") + (motionProcessor.distanceTracker.distance2(motionProcessor.trackFeatures.keyPoints()))) + ")"));
}