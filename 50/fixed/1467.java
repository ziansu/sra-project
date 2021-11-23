public int getCapacityOfTablesByNumber(java.util.List<java.lang.Integer> tableNumbers) {
    int capacity = 0;
    for (int tableNumber : tableNumbers) {
        capacity += this.tables.get(tableNumber).getsize();
    }
    return capacity;
}