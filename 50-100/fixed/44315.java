private Controller.TestPlanner.TestState bestState() {
    Controller.TestPlanner.TestState good;
    int goodValue = 0;
    for (Controller.TestPlanner.TestState s : exploredStates) {
        if ((s.value()) > goodValue) {
            good = s;
        }
    }
    for (Controller.TestPlanner.TestState s : unexploredStates) {
        if ((s.value()) > goodValue) {
            good = s;
        }
    }
    return null;
}