public void addCode() {
    if ((maxW) < (Bdd.CircularCounter.imax)) {
        (maxW)++;
    }
    (codeArray.minW)++;
    if ((offSet) == 0) {
        offSet = (Bdd.CircularCounter.imax) - 1;
    }else {
        (offSet)--;
    }
}