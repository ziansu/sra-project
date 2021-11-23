private boolean alreadyContainsDate(java.lang.String date) {
    for (java.lang.String s : retrieveData()) {
        if (s.equals(date)) {
            return true;
        }
    }
    return false;
}