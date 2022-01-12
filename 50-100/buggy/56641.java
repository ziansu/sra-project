public static int determineStart(final models.record.Track track) {
    switch (controllers.AlgorithmSelector.curMode) {
        case INTENSITY :
            return controllers.AlgorithmSelector.commentIntensity(track);
        case RANDOM :
            return controllers.AlgorithmSelector.random(track);
        default :
            int start;
            start = controllers.AlgorithmSelector.commentIntensity(track);
            if (start == 0) {
                start = controllers.AlgorithmSelector.random(track);
            }
            return start;
    }
}