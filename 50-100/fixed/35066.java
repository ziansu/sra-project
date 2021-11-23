public void add(int field, int amount) {
    this.getSolar().add(field, amount);
    this.computeBySolarDate(this.getSolar().get(java.util.Calendar.YEAR), ((this.getSolar().get(java.util.Calendar.MONTH)) + 1), this.getSolar().get(java.util.Calendar.DATE));
}