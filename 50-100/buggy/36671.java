@org.junit.Test
public void testAtMost_withSourceLessThanTwiceRequestedSize_returnsScaleFactorOfTwo() {
    com.google.common.truth.Truth.assertThat(DownsampleStrategy.AT_MOST.getScaleFactor(150, 150, 100, 100)).isEqualTo(2.0F);
    com.google.common.truth.Truth.assertThat(DownsampleStrategy.AT_MOST.getScaleFactor(101, 101, 100, 100)).isEqualTo(2.0F);
    com.google.common.truth.Truth.assertThat(DownsampleStrategy.AT_MOST.getScaleFactor(199, 199, 100, 100)).isEqualTo(2.0F);
}