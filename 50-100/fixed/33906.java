public Item dequeue() {
    if ((size) == 0)
        throw new java.util.NoSuchElementException();
    
    int randIndex = edu.princeton.cs.algs4.StdRandom.uniform(((size)--));
    Item item = array[randIndex];
    array[randIndex] = array[size];
    array[size] = null;
    if (((size) > 1) && ((size) == ((array.length) / 4)))
        shrinkArray();
    
    return item;
}