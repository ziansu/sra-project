public void calculateFragLen() {
    java.util.Collections.sort(getPosTags());
    for (int posValue : getPosTags()) {
        java.util.Set<java.lang.Integer> subList = getNegTags().subSet(posValue, (posValue + 5000));
        for (int negValue : subList) {
            fragLen = negValue - posValue;
            if (((fragLen) > 0) && ((fragLen) <= 2000)) {
                (getCounts()[((fragLen) - 1)])++;
            }
        }
    }
}