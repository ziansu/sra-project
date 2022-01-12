private boolean isValidTimeRange(java.lang.String currWord) {
    boolean ans = false;
    if (isNumber(currWord)) {
        int currInt = java.lang.Integer.parseInt(currWord);
        boolean isTwelvePm = currInt <= 12;
        boolean isFourThirtyPm = ((currInt / 100) <= 12) && ((currInt % 100) <= 60);
        ans = isTwelvePm || isFourThirtyPm;
    }
    return ans;
}