public boolean buySignal() {
    if ((columns.size()) < 2) {
        return false;
    }
    if ((columns.get(0)) >= (signalBoxes)) {
        if ((columns.get(0)) > (columns.get(2))) {
            return true;
        }
    }
    return false;
}