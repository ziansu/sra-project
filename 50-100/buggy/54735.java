int getAdjustedNumberOfFrames(java.lang.String speech, double approxDuration, int animFramesCount, double duration) {
    int durationOfSingleAnimation = ((int) (duration * 1000.0));
    double numberOfTimesAnimRepeats = approxDuration / durationOfSingleAnimation;
    int numberOfFramesTotal = ((int) (numberOfTimesAnimRepeats * animFramesCount));
    return numberOfFramesTotal;
}