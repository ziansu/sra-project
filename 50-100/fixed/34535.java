@java.lang.Override
public int compare(java.lang.String lhs, java.lang.String rhs) {
    if ((lhs.length()) != (rhs.length())) {
        return (lhs.length()) - (rhs.length());
    }else {
        return lhs.compareTo(rhs);
    }
}