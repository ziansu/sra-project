public boolean dropProduct(char row, int compartment) {
    if (this.rows.containsKey(row)) {
        return this.rows.get(row).dropProduct(compartment);
    }
    java.lang.System.out.println("Error: Invalid row");
    return false;
}