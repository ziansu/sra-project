public final int readCharacter(final char... allowed) throws java.io.IOException {
    char c;
    java.util.Arrays.sort(allowed);
    while ((java.util.Arrays.binarySearch(allowed, (c = ((char) (readCharater()))))) < 0) {
    } 
    return c;
}