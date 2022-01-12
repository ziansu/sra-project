public int howManyDifferentWords() {
    int count = 0;
    mmn15.WordNode currentNode = first;
    while (currentNode != null) {
        count += 1;
        currentNode = currentNode.getNext();
    } 
    return count;
}