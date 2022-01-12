public boolean passed() {
    for (int count = 0; count < (correctArray.length); count++) {
        if ((correctArray[count]) == (inputArray[count])) {
            (correctAns)++;
        }
    }
    if ((correctAns) >= 15) {
        return true;
    }else {
        return false;
    }
}