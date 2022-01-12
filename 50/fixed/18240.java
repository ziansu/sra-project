@java.lang.Override
protected boolean condition() {
    synchronized(this) {
        if ((fOccurrences) != (-1)) {
            assertEquals(expected, fOccurrences);
            return true;
        }
        return false;
    }
}