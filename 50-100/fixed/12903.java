private boolean isMonth(java.lang.String nextWord) {
    boolean ans = false;
    for (int i = 1; i < (monthsInYear.length); i++) {
        if (nextWord.contains(monthsInYear[i])) {
            ans = true;
            break;
        }
    }
    return ans;
}