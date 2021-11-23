public boolean isRotation(java.lang.String s1, java.lang.String s2) {
    java.lang.String duplicatedS1 = s1 + s1;
    return isSubstring(duplicatedS1, s2);
}