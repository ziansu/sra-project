@java.lang.Override
public void add(int index, E element) {
    underlyingList.add(index, element);
    markAsStale();
}