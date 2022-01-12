public double getTotalCost(java.util.List<java.lang.String> listOfStrings) {
    this.listOfStrings = listOfStrings;
    java.util.List<java.lang.Double> listOfDoubles = findAllDoubles(listOfStrings);
    try {
        return java.util.Collections.max(listOfDoubles);
    } catch (java.lang.Exception cce) {
        int index = checkForText();
        double totalCost = (index >= 0) ? checkBeforeAndAfter(index) : 0;
        return totalCost;
    }
}