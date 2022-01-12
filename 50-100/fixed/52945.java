public boolean newRun() {
    if ((power) == false) {
        return false;
    }
    if ((currentRun) != null) {
        return false;
    }
    int newRunNumber = (runs.size()) + 1;
    Run current = new Run(individual, parallel, newRunNumber);
    current.setEvent(individual, parallel);
    runs.add(current);
    currentRun = current;
    return true;
}