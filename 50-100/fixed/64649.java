public boolean sellSignal() {
    if ((columns.size()) < 2) {
        return false;
    }
    if ((columns.get(0)) <= ((signalBoxes) * (-1))) {
        if ((columns.get(0)) < (columns.get(2))) {
            return true;
        }
    }
    return false;
}