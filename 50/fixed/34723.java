private void init(int power) {
    this.capacity = power;
    this.table = new java.util.ArrayList<>(java.util.Collections.nCopies(capacity, null));
    this.size = 0;
}