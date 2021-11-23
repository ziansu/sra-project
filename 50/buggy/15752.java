@java.lang.Override
public ue5.Village next() {
    if (hasNext()) {
        (index)++;
        return village[index];
    }else {
        throw new java.util.NoSuchElementException((("No further village in array at position: village[" + (index)) + "]"));
    }
}