private void heapifyUp() {
    int currentIndex = (size) - 1;
    while ((hasParent(currentIndex)) && ((parent(currentIndex)) < (items[currentIndex]))) {
        swap(currentIndex, getParentIndex(currentIndex));
        currentIndex = getParentIndex(currentIndex);
    } 
}