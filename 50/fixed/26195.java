protected int getNumOfSamplesIn(int millis) {
    return (java.lang.Math.abs(millis)) * (mSamplesInOneMilliSec);
}