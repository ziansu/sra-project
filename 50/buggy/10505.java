private java.lang.Double getRatioScore(java.lang.Double jufuPercent, java.lang.Double hgaGameRatio) {
    lingda.service.GameRatioAnalyzer.logger.info("analyzer gives {}", ((jufuPercent - 1) * hgaGameRatio));
    return (jufuPercent - 1) * hgaGameRatio;
}