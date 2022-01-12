public Item dequeue() {
    if (((item) == null) || (isEmpty()))
        throw new java.lang.NullPointerException();
    
    checkSize();
    int randomIndex = edu.princeton.cs.algs4.StdRandom.uniform(0, numOfItems);
    Item randomItem = queue[randomIndex];
    queue[randomIndex] = queue[((numOfItems) - 1)];
    (numOfItems)--;
    return randomItem;
}