@java.lang.Override
public void setPosition(final long position, final int d) {
    flags[d] = position > 0;
}