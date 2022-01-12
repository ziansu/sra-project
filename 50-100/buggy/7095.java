public Iterator<Item> iterator() {
    Item[] itarray = new Item[size];
    RandomizedQueue throwaway = new RandomizedQueue(rq);
    i = 0;
    while (!(throwaway.isEmpty())) {
        itarray[((i)++)] = throwaway.dequeue();
    } 
    return new RandomizedQueueIterator<Item>(itarray);
}