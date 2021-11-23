public static java.util.List<java.lang.Integer> getForecastLengths(int roundId) {
    org.powertac.tournament.services.Forecaster.Forecast forecast = org.powertac.tournament.services.MemStore.forecasts.get(roundId);
    java.util.List<java.lang.Integer> result = new java.util.ArrayList<java.lang.Integer>();
    for (org.powertac.tournament.beans.Game game : forecast.getGamesMap().values()) {
        result.add(game.getGameLength());
    }
    return result;
}