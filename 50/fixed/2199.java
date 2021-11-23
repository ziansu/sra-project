@java.lang.Override
public int compare(java.util.Map.Entry<java.lang.String, java.lang.Double> entry1, java.util.Map.Entry<java.lang.String, java.lang.Double> entry2) {
    return entry2.getValue().compareTo(entry1.getValue());
}