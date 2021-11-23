public void addMatchPerformance(int matchday, analyse.SpielPerformance matchPerformance) {
    matchPerformances.put(model.Mannschaft.getKey(matchday), matchPerformance);
}