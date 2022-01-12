@java.lang.Override
public void setPosition(final long pos, final int d) {
    final long distance = (pos - (position[d])) + (currentOffset[d]);
    move(distance, d);
}