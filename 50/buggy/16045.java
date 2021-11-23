@java.lang.SuppressWarnings(value = "unchecked")
private void changeSize(int newSize) {
    Item[] newArray = ((Item[]) (new java.lang.Object[newSize]));
    fill(newArray);
    elementData = newArray;
    start = 0;
    end = size;
}