public int compareTo(org.awaitility.Duration other) {
    if (other == null)
        return 1;
    
    return java.lang.Long.compare(getValueInMS(), other.getValueInMS());
}