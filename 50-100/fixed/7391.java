void merge(hivemall.fm.FMPredictUDAF.PartialResult other) {
    this.ret += other.ret;
    if ((this.sumVjXj) == null) {
        this.sumVjXj = other.sumVjXj;
        this.sumV2X2 = other.sumV2X2;
    }else {
        hivemall.fm.FMPredictUDAF.PartialResult.add(other.sumVjXj, sumVjXj);
        assert (sumV2X2) != null;
        hivemall.fm.FMPredictUDAF.PartialResult.add(other.sumV2X2, sumV2X2);
    }
}