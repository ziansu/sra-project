public void dropProduct(char row, int compartment) {
    if (this.rows.containsKey(row)) {
        this.rows.get(row).dropProduct(compartment);
    }else {
        java.lang.System.out.println("Error: Invalid row");
    }
}