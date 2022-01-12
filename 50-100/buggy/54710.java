private int largerChild(int index) {
    int largerChild;
    int leftChild = (2 * index) + 1;
    int rightChild = leftChild + 1;
    if ((rightChild < (this.lastIndex)) && ((this.elements[rightChild].compareTo(this.elements[leftChild])) > 0)) {
        largerChild = rightChild;
    }else {
        largerChild = leftChild;
    }
    return largerChild;
}