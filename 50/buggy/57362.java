private boolean isOutOfRange(float posDegrees) {
    return (posDegrees <= (de.lin_engel.controllib.VolumeKnob.MIN_ANGLE)) || (posDegrees >= (de.lin_engel.controllib.VolumeKnob.MAX_ANGLE));
}