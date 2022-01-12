public dao.MovingAverageDao getMovingAverage() {
    if ((this.cachedMovingAverage) == null) {
        this.cachedMovingAverage = dao.MovingAverageDao.getMovingAverage(this.symbol);
    }
    return this.cachedMovingAverage;
}