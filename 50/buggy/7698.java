public final float calc(long time, float startValue, float changeInValue, long duration) {
    return easing.calc(time, time, changeInValue, duration);
}