private void setMemoryValues() {
    int[] totalAndUsed = edu.berkeley.cs.amplab.carat.android.sampling.SamplingLibrary.readMeminfo();
    memoryUsedConverted = 1 - (((float) (totalAndUsed[0])) / (totalAndUsed[1]));
    if ((totalAndUsed.length) > 2) {
        memoryActiveConverted = ((float) (totalAndUsed[2])) / ((totalAndUsed[3]) + (totalAndUsed[2]));
    }
    cpuUsageConverted = mainActivity.getCpuValue();
}