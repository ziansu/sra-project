@java.lang.Override
public final boolean hasNext() {
    return (computeIndexForNextValue()) >= 0;
}