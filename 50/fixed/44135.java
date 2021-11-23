private boolean alreadyContainsDate(java.lang.String date) {
    for (java.lang.String s : data) {
        if (s.equals(date)) {
            return true;
        }
    }
    return false;
}