private boolean checkDuplicate(final java.lang.String dup, final java.util.List<java.lang.String> seen, java.util.List<java.lang.String> props) {
    if (seen.contains(dup)) {
        props.add(java.lang.String.valueOf(java.util.Collections.frequency(seen, dup)));
        seen.add(dup);
        return true;
    }
    return false;
}