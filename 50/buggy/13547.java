@java.lang.Override
public void shift(int position, int length, int distance) {
    java.lang.System.arraycopy(data, pos, data, (position + distance), length);
}