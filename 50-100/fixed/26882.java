@java.lang.Override
public int nextNZ(int i) {
    int x = findOffset(i);
    if (x < 0)
        x = ((-x) - 1) - (_elem_sz);
    
    _previousOffset = x += _elem_sz;
    return getId(x);
}