public void move(int oldRow, int oldCol, int newRow, int newCol) {
    this.checkSlot(oldRow, oldCol);
    this.checkSlot(newRow, new Col());
    Polarity old = this.get(oldRow, oldCol);
    Polarity temp = this.get(newRow, newCol);
    this.slots[newRow][newCol] = old;
    this.slots[oldRow][oldCol] = temp;
}