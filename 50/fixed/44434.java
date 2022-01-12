@java.lang.Override
public int compare(java.util.Map.Entry<java.lang.Class, java.lang.Long> o1, java.util.Map.Entry<java.lang.Class, java.lang.Long> o2) {
    return o2.getValue().compareTo(o1.getValue());
}