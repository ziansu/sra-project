@java.lang.Override
public int compare(java.lang.String a, java.lang.String b) {
    java.lang.Integer x = base.get(a);
    java.lang.Integer y = base.get(b);
    if (x.equals(y)) {
        return a.compareTo(b);
    }
    return (-1) * (x.compareTo(y));
}