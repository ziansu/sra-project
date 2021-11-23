private java.lang.String pretty(int idx) {
    return idx >= 0 ? idx < (pattern.length()) ? ("'" + (pattern.charAt(idx))) + "'" : "<eos>" : "<neg>";
}