private void pushUp(int index) {
    java.lang.String child = arr.get(index);
    java.lang.String parent = arr.get((index / 2));
    while (((((child.compareTo(parent)) * 1.0) * (min)) < 0) && (index > 1)) {
        swap(index, (index / 2));
        index = index / 2;
    } 
}