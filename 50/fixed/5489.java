@java.lang.Override
public int compare(java.util.Map.Entry<java.lang.String, java.lang.Integer> o1, java.util.Map.Entry<java.lang.String, java.lang.Integer> o2) {
    return o2.getValue().compareTo(o1.getValue());
}