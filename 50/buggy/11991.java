public void advance() {
    if ((currentFenNumber) < ((fens.size()) - 1)) {
        (currentFenNumber)++;
        updateToReflectFenNumber();
    }
}