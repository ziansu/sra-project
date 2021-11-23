public boolean sellSignal() {
    if ((columns.get(0)) <= ((signalBoxes) * (-1))) {
        if ((columns.get(0)) < (columns.get(2))) {
            return true;
        }
    }
    return false;
}