public boolean incorrectDate() {
    java.util.Date todayDate = new java.util.Date();
    if ((((date.getYear()) == (todayDate.getYear())) && ((date.getMonth()) == (todayDate.getMonth()))) && ((date.getDate()) == (todayDate.getDate()))) {
        return false;
    }
    return true;
}