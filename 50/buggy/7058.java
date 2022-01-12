public boolean inLivelyLevel(com.sample.agilesamurai.moriagirl.utils.LivelyLevel level) {
    return ((minLivelyLevel.ordinal()) < (level.ordinal())) && ((level.ordinal()) > (maxLivelyLevel.ordinal()));
}