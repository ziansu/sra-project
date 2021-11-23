@java.lang.Override
public int compare(java.lang.Integer o1, java.lang.Integer o2) {
    int first = new java.lang.Integer(farness[o1]).compareTo(farness[o2]);
    if (((farness[o1]) == 0) || ((farness[o2]) == 0)) {
    }
    return first == 0 ? o1.compareTo(o2) : first;
}