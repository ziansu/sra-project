private void pushDown(int index) {
    java.lang.String child = arr[(index * 2)];
    java.lang.String parent = arr[index];
    while (((((parent.compareTo(child)) * 1.0) * (min)) > 0) && ((index * 2) <= (arr.size()))) {
        swap(index, (index * 2));
        index = index * 2;
    } 
}