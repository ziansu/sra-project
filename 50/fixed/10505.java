private java.lang.Double getRatioScore(java.lang.Double jufuPercent, java.lang.Double hgaGameRatio) {
    lingda.service.GameRatioAnalyzer.logger.info("analyzer gives {}", (jufuPercent * (hgaGameRatio - 1)));
    return jufuPercent * (hgaGameRatio - 1);
}