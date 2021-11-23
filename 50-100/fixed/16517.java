private void collectData(com.nwu.data.taxi.domain.model.Performance performance) {
    for (com.nwu.data.taxi.service.helper.model.PerformanceView performanceView : performanceViews) {
        if (performanceView.getTime().equals(performance.getTime())) {
            performanceView.addPerformance(performance);
            performance = null;
            break;
        }
    }
    if (null != performance) {
        performanceViews.add(new com.nwu.data.taxi.service.helper.model.PerformanceView(performance));
    }
}