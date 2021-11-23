private void finalizeResult() {
    this.refKeypoint.release();
    this.refKeypoint = null;
    for (org.opencv.core.MatOfDMatch dMatch : this.goodMatchList) {
        dMatch.release();
        dMatch = null;
    }
    this.goodMatchList.clear();
    for (org.opencv.core.MatOfKeyPoint keyPoint : this.keyPointList) {
        keyPoint.release();
        keyPoint = null;
    }
    this.keyPointList.clear();
    this.referenceMat.release();
    this.referenceMat = null;
}