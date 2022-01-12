@java.lang.Override
public float[] getProgress() {
    for (int i = 0; i < (progression.length); i++) {
        progressBars[i] = java.lang.Math.max(0.12597656F, (((float) (progression[i])) / ((float) (progressionMax[i]))));
    }
    return progressBars;
}