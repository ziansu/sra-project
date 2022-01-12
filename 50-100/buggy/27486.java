public <T> void invert(java.util.ArrayList<T> array) {
    T temp;
    int size = array.size();
    for (int i = 0; i < (size / 2); i++) {
        int index = (size - i) - 1;
        temp = array.get(i);
        array.set(i, array.get(index));
        array.set(index, temp);
    }
}