public Item sample() {
    if ((size) == 0)
        throw new java.util.NoSuchElementException();
    
    return array[edu.princeton.cs.algs4.StdRandom.uniform(size)];
}