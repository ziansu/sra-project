public java.lang.String generateScore() {
    return (((((((getName()) + " ") + (getCurrentWins())) + ":") + (getCurrentLosses())) + " ") + (java.lang.Math.round(generateRatio()))) + '%';
}