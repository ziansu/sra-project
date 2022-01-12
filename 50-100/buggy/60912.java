public static int getRandomNumber(int len, int maxNumber) {
    int returnedNumber = 0;
    int incrementBy = 1;
    int unitNumber = 0;
    for (int i = 0; i < len; i++) {
        unitNumber = (com.weblearning.math.grade5.Grade5Utilities.getUnitNumber(maxNumber)) * incrementBy;
        incrementBy = incrementBy * 10;
        returnedNumber = returnedNumber + unitNumber;
    }
    return returnedNumber;
}