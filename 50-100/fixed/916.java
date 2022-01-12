private Item randomItemSelector(boolean pop) {
    if (isEmpty())
        throw new java.util.NoSuchElementException("Queue underflow");
    
    int randomIdx = edu.princeton.cs.algs4.StdRandom.uniform(0, ((numElementsWithNulls) + 1));
    while ((stackArray[randomIdx]) == null) {
        randomIdx = edu.princeton.cs.algs4.StdRandom.uniform(0, ((numElementsWithNulls) + 1));
    } 
    Item randomItem = stackArray[randomIdx];
    if (pop) {
        stackArray[randomIdx] = null;
        (numElements)--;
    }
    return randomItem;
}