public double getTotalCost(java.util.List<java.lang.String> listOfStrings) {
    this.listOfStrings = listOfStrings;
    java.util.List<java.lang.Double> listOfDoubles = findAllDoubles(listOfStrings);
    try {
        return java.util.Collections.max(listOfDoubles);
    } catch (java.lang.ClassCastException cce) {
        int index = checkForText();
        double totalCost = checkBeforeAndAfter(index);
        return totalCost;
    }
}