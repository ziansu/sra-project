private void processSeparator() {
    if ((operation) == (Operation.NONE)) {
        leftValue.setDecimal(true);
    }else {
        if (!(rightValue.isEmpty())) {
            rightValue.setDecimal(true);
        }
    }
}