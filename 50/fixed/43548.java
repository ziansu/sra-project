public int compareTo(org.awaitility.Duration other) {
    if (other == null)
        return 1;
    
    long x = getValueInMS();
    long y = other.getValueInMS();
    return x < y ? -1 : x == y ? 0 : 1;
}