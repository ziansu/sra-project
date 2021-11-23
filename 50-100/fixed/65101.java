@java.lang.Override
public int compare(java.lang.String s, java.lang.String t1) {
    if ((s == null) || (s.isEmpty())) {
        s = "0";
    }
    if ((t1 == null) || (t1.isEmpty())) {
        t1 = "0";
    }
    return getValue(s).compareTo(getValue(t1));
}