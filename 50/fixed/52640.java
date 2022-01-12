@java.lang.Override
public boolean getBoolean(long i) {
    java.lang.String s = get(i);
    return s != null ? (s.length()) != 0 : false;
}