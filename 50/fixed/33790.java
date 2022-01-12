@java.lang.Override
public int getCurrentPosition() {
    return (mMediaExtractor) == null ? 0 : ((int) ((mMediaExtractor.getSampleTime()) / 1000L));
}