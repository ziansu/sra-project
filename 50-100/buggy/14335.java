@java.lang.Override
public boolean addAll(int index, java.util.Collection<? extends E> c) {
    int count = 0;
    for (E e : c) {
        int prevSize = size();
        add((index + count), e);
        if ((prevSize + 1) == (size()))
            count++;
        
    }
    return count != 0;
}