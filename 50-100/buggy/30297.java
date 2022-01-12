@java.lang.Override
public int next(int position) {
    position = adjPosition(position);
    if (position == (finish))
        return size();
    
    if (position == ((finish) - 1))
        return (set.contains(position) ? position : finish) - (start);
    
    return first(set.tailSet(position));
}