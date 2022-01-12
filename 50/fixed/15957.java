@java.lang.Override
public final boolean hasNext() {
    return ((this.size) > 0) && ((computeIndexForNextValue()) >= 0);
}