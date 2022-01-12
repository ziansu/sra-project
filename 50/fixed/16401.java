@java.lang.Override
public void setAdBreakTimesMs(@android.support.annotation.Nullable
long[] adBreakTimesMs, int adBreakCount) {
    com.google.android.exoplayer2.util.Assertions.checkArgument(((adBreakCount == 0) || (adBreakTimesMs != null)));
    this.adBreakCount = adBreakCount;
    this.adBreakTimesMs = adBreakTimesMs;
    update();
}