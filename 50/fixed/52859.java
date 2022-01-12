public java.util.List<dao.IndicatorDao> getIndicators() {
    if ((this.cachedIndicators) == null) {
        this.cachedIndicators = dao.IndicatorDao.getAllIndicators(this.symbol);
    }
    return this.cachedIndicators;
}