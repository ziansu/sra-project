public boolean dropProduct() {
    if ((this.stock) == 0) {
        java.lang.System.out.println("Error: No stock!");
        return false;
    }
    (this.stock)--;
    return true;
}