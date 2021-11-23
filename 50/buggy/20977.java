public int compare(java.lang.String s1, java.lang.String s2) {
    return org.binson.lowlevel.ByteArrayComparator.compareArrays(s1.getBytes(java.nio.charset.StandardCharsets.UTF_8), s1.getBytes(java.nio.charset.StandardCharsets.UTF_8));
}