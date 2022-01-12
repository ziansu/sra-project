private void fillProbabilityUniModel() {
    java.util.Map<java.lang.Character, java.lang.Integer> ocurrences = contextModel.getOcurrencesForOrderEqualToZero();
    java.lang.System.out.println(ocurrences);
    int totalOcurrences = getTotalOcurencesOfRow(ocurrences);
    for (java.lang.Character term : ocurrences.keySet()) {
        probabilityUniModel.put(term, probabilityOfAChar(totalOcurrences, ocurrences.get(term)));
    }
}