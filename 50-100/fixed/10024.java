@java.lang.Override
public boolean contains(java.lang.Object o) {
    if (o instanceof java.lang.Number) {
        java.lang.Number n = ((java.lang.Number) (o));
        int index = n.intValue();
        return ((index > 0) && (index < (selectedIndices.length()))) && (selectedIndices.get(index));
    }
    return false;
}