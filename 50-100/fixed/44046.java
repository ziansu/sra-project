public boolean checkIfEquals(int checkNumber) {
    inputtedNumbers.add(checkNumber);
    boolean isEqual = checkNumber == (rightNumber);
    if (!isEqual) {
        if (checkNumber < (rightNumber))
            addRangeToStatistics((checkNumber + 1), maxValues.get(((maxValues.size()) - 1)));
        else
            addRangeToStatistics(minValues.get(((minValues.size()) - 1)), (checkNumber - 1));
        
    }
    return isEqual;
}