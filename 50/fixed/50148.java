private boolean filtLocation(com.chinaway.android.library.locationtracker.sampler.SampleLocation location) {
    boolean isTooClose = isTooClose(mLocation, location);
    if (!isTooClose) {
        mLocation = location;
    }
    return isTooClose;
}