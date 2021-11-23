@java.lang.Override
public int next(int position) {
    int size = size();
    if (position == size)
        return size;
    
    if (position == (size - 1))
        return set.contains(position) ? position : size;
    
    return first(set.tailSet(position));
}