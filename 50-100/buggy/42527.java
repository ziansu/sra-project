public boolean buySignal() {
    if ((columns.get(0)) >= (signalBoxes)) {
        if ((columns.get(0)) > (columns.get(2))) {
            return true;
        }
    }
    return false;
}