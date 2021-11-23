@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || ((getClass()) != (o.getClass()))) {
        return false;
    }
    ua.nure.chulkov.Practice2.MyListImpl objects = ((ua.nure.chulkov.Practice2.MyListImpl) (o));
    return ((size) == (objects.size)) && (java.util.Arrays.equals(array, objects.array));
}