public java.util.Iterator<Item> iterator() {
    java.lang.Object[] itarray = new java.lang.Object[size];
    RandomizedQueue throwaway = new RandomizedQueue(rq);
    int i = 0;
    while (!(throwaway.isEmpty())) {
        itarray[(i++)] = throwaway.dequeue();
    } 
    return new RandomizedQueueIterator(itarray);
}