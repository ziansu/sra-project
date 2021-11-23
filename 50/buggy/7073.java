@java.lang.Override
public long mediaGetCurrentMs() {
    return (tvInputPlayer.getCurrentPosition()) + (mediaGetStartMs());
}