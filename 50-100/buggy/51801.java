public Item sample() {
    int R = getRandomNumber(((n) - 1));
    A02_Randomized_Queue_and_Deques.RandomizedQueue<Item>.Node pointer = first;
    int i = 0;
    while (i < R) {
        if (hasNext(pointer)) {
            pointer = pointer.next;
            i++;
        }
    } 
    return pointer.item;
}