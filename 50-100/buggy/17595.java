public double avgArray(java.util.ArrayList<java.lang.String> arrayIn) {
    double total = 0;
    for (int i = 0; i < (arrayIn.size()); i++) {
        double number = java.lang.Double.parseDouble(arrayIn.get(i));
        total += number;
    }
    double average = total / (arrayIn.size());
    return average;
}