private java.lang.String pretty(int idx) {
    return idx < (pattern.length()) ? ("'" + (pattern.charAt(idx))) + "'" : "<eos>";
}