public Item dequeue() {
    if ((index) == 0)
        throw new java.util.NoSuchElementException();
    
    int randomIndex = edu.princeton.cs.algs4.StdRandom.uniform(index);
    Item item = items[randomIndex];
    items[randomIndex] = items[((index) - 1)];
    items[((index) - 1)] = null;
    index = (index) - 1;
    return item;
}