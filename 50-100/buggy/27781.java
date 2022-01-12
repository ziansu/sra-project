private int getTotalCounts(java.lang.String[] infoField, boolean hasHaploidObservations) {
    int sum = 0;
    for (int i = 0; i < (infoField.length); i++) {
        if (!hasHaploidObservations) {
            sum += java.lang.Integer.valueOf(infoField[i]);
        }else
            if (hasHaploidObservations && ((GTSStringArray[i].length()) != 1)) {
                sum += java.lang.Integer.valueOf(infoField[i]);
            }
        
    }
    return sum;
}