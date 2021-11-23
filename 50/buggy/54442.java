@java.lang.Override
public int compare(java.util.Map.Entry<java.lang.String, java.lang.Float> o1, java.util.Map.Entry<java.lang.String, java.lang.Float> o2) {
    return ((o1.getValue()) - (o2.getValue())) > 0 ? -1 : 1;
}