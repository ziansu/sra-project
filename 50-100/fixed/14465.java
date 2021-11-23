public double getSpeedLimitsAverageCoeff(double frPct, double fuPct, double rPct) {
    double averageSpeedLimit = ((((com.edmunds.track.speed.SpeedLimitsAnalyzer.FREEWAY_RURAL_MAX) * frPct) / 100) + (((com.edmunds.track.speed.SpeedLimitsAnalyzer.FREEWAY_URBAN_MAX) * fuPct) / 100)) + (((com.edmunds.track.speed.SpeedLimitsAnalyzer.RESIDENTIAL_MAX) * rPct) / 100);
    return (averageSpeedLimit - (com.edmunds.track.speed.SpeedLimitsAnalyzer.RESIDENTIAL_MAX)) / ((com.edmunds.track.speed.SpeedLimitsAnalyzer.FREEWAY_RURAL_MAX) - (com.edmunds.track.speed.SpeedLimitsAnalyzer.RESIDENTIAL_MAX));
}