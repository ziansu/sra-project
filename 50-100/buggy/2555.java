@java.lang.Override
public E next() {
    if (!(hasNext()))
        throw new java.util.NoSuchElementException("No more elements remaining in iterator");
    
    collection.HashMultiset.Entry<E> entry = iteratorTable[pointer];
    E result = entry.data;
    if ((entry.next) != null) {
        iteratorTable[pointer] = entry.next;
    }else
        (pointer)++;
    
    return result;
}