@java.lang.Override
public int getWindowOffset(final long position) {
    return (windowBytes.length()) > 0 ? ((int) (position % ((long) (windowBytes.length())))) : 0;
}