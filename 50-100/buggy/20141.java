private void fillProbabilityUniModel() {
    java.util.Map<java.lang.Character, java.lang.Integer> ocurrences = contextModel.getOcurrencesForOrderEqualToZero();
    int totalOcurrences = getTotalOcurencesOfRow(ocurrences);
    for (java.lang.Character term : ocurrences.keySet()) {
        for (java.util.Map.Entry<java.lang.Character, java.lang.Integer> entry : ocurrences.entrySet()) {
            probabilityUniModel.put(term, probabilityOfAChar(totalOcurrences, entry.getValue()));
        }
    }
}