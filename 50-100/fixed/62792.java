@java.lang.Override
public void work() {
    int offset = index;
    int width = getWidth();
    for (int x = 1; x <= width; x++ , offset++) {
        float adjacentValueSum = fluidField.sumAdjacentValues(offset, source);
        destination[offset] = (constant) * ((source[offset]) + ((a) * adjacentValueSum));
    }
}