private int SetPowerAccordingToCurrentSpeedAndFutureTrackParts(java.util.ArrayList<com.zuehlke.carrera.javapilot.model.TrackPart> recordedCombination) {
    if ((recordedCombination.size()) == ((com.zuehlke.carrera.javapilot.akka.experimental.VettelPowerStrategy.COUNT_OF_TRACKPARTS_TO_COMPARE) + (com.zuehlke.carrera.javapilot.akka.experimental.VettelPowerStrategy.COUNT_OF_FORWARD_LOOKING_TRACKPARTS))) {
        int currentSpeed = estimateCurrentSpeed(recordedCombination);
        return estimatePossiblePower(recordedCombination, currentSpeed);
    }else {
        return -1;
    }
}