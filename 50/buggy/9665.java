@java.lang.Override
public java.lang.Boolean compare(java.lang.Comparable a, java.lang.Comparable b) {
    return a == null ? b != null : (a.compareTo(b)) != 0;
}