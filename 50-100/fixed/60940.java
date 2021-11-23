public int calculateB() {
    java.lang.String givenLocation = getLocation();
    int givenIncome = getIncome();
    int count = (givenLocation.length()) + givenIncome;
    do {
        count = count - 7;
    } while (count >= 10 );
    return count;
}