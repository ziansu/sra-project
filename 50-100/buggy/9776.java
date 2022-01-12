public double getCoefficientOfVariation() {
    int count = this.getCount();
    if (count == 0) {
        throw new cfvbaibai.cardfantasy.CardFantasyRuntimeException("Cannot get square deviation on empty data set.");
    }
    double s = 0.0;
    double avg = this.getAverage();
    for (double data : this.dataList) {
        s += (data - avg) * (data - avg);
    }
    return (java.lang.Math.sqrt((s / count))) / avg;
}