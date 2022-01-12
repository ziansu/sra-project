public java.util.List<java.lang.Float> getTotals(int index) {
    java.util.List<java.lang.Float> totals = new java.util.ArrayList<>();
    for (int i = 0; i < (desiredNutrients.size()); i++) {
        totals.add(getTotal(nutrientColumns.get(i), defaultUnits.get(i), index));
    }
    return totals;
}