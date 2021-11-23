private int getTotalCounts(java.lang.String[] infoField) {
    int sum = 0;
    for (int i = 0; i < (infoField.length); i++) {
        sum += java.lang.Integer.valueOf(infoField[i]);
    }
    return sum;
}