public static int determineStart(final models.record.Track track) {
    int start;
    switch (controllers.AlgorithmSelector.curMode) {
        case INTENSITY :
            start = controllers.AlgorithmSelector.commentIntensity(track);
            break;
        case RANDOM :
            start = controllers.AlgorithmSelector.random(track);
            break;
        default :
            start = controllers.AlgorithmSelector.commentIntensity(track);
            if (start == 0) {
                start = controllers.AlgorithmSelector.random(track);
            }
            break;
    }
    return start;
}