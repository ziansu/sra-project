public boolean noRepeat(java.lang.String num1) {
    for (java.lang.String x : prevQuest) {
        if (num1.equals(x)) {
            return true;
        }
    }
    return false;
}