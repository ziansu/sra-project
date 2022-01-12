@java.lang.Override
public int moveToPrevious(int position) {
    return (set.previousSetBit(((position - (offset)) - 1))) + (offset);
}