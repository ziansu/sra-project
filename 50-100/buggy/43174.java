protected void run(de.tu_darmstadt.stg.mubench.cli.DetectorMode detectorMode, de.tu_darmstadt.stg.mubench.cli.DetectorArgs args, de.tu_darmstadt.stg.mubench.cli.DetectorOutput output) throws java.lang.Exception {
    switch (detectorMode) {
        case DETECT_ONLY :
            detectOnly(args.getTrainingPath(), args.getTargetPath(), output);
            break;
        case MINE_AND_DETECT :
            mineAndDetect(args.getTrainingPath(), output);
            break;
        default :
            throw new java.lang.IllegalArgumentException(("Unsupported runmode: " + detectorMode));
    }
}