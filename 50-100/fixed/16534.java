@java.lang.SuppressWarnings(value = "unchecked")
protected void restoreInitiallyAvailable() {
    initiallyAvailInColumn = new java.util.HashSet[n];
    for (int i = 0; i < (n); i++) {
        initiallyAvailInColumn[i] = new java.util.HashSet<java.lang.Integer>();
        initiallyAvailInColumn[i].addAll(this.availableInCol[i]);
    }
}