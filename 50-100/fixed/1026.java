private void findEndDate() {
    if ((dataModel.getTargetDose()) == null) {
        return ;
    }
    org.openimmunizationsoftware.cdsi.core.domain.SeriesDose referenceSeriesDose = dataModel.getTargetDose().getTrackedSeriesDose();
    if ((referenceSeriesDose.getSeasonalRecommendationList().size()) > 0) {
        java.util.Date seasonalRecommendationEndDate = referenceSeriesDose.getSeasonalRecommendationList().get(0).getSeasonalRecommendationEndDate();
        caEndDate.setInitialValue(seasonalRecommendationEndDate);
    }else {
    }
}