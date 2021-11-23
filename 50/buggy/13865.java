public void setValueAtColumn(int column, int value) {
    this.unsafe.putInt((((this.writeBaseAddress) + column) << 2), value);
}