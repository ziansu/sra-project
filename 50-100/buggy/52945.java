public void newRun() {
    if ((power) == false) {
        return ;
    }
    if ((currentRun) != null) {
        return ;
    }
    int newRunNumber = (runs.size()) + 1;
    Run current = new Run(individual, parallel, newRunNumber);
    current.setEvent(individual, parallel);
    runs.add(current);
    currentRun = current;
}