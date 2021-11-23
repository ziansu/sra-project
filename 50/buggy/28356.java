public double getAverageRatePer(com.kadif.commons.charpter4.EWMA.Time time) {
    return (this.average) == 0.0 ? this.average : ((this.average) / (time.getTime())) / (this.average);
}