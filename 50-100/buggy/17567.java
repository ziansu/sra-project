public java.lang.String printSplurges() {
    java.lang.String expenses = "";
    for (java.lang.String key : splurges.keySet()) {
        expenses += key + ":\n";
        for (Expenses expense : splurges.get(key)) {
            expenses += expense + "\n";
        }
    }
    return expenses;
}