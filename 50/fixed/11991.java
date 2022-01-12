public boolean advance() {
    if ((currentFenNumber) < ((fens.size()) - 1)) {
        (currentFenNumber)++;
        updateToReflectFenNumber();
        return true;
    }else {
        return false;
    }
}