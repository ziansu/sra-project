private <T> T getValueAt(java.util.List<T> values, java.util.List<java.lang.Integer> frequencies, int index) {
    int pointer = 0;
    while ((frequencies.get(index)) < index) {
        pointer++;
    } 
    return values.get(pointer);
}