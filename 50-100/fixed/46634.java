public parsers.MainState transition(parsers.StateMachine machine) {
    if ((machine.stateData) == null) {
        machine.stateData = new parsers.FirstLineParser.Data();
    }
    parsers.FirstLineParser.Data stateData = ((parsers.FirstLineParser.Data) (machine.stateData));
    parsers.FirstLineParser.FirstLineState prevState = stateData.firstLineState;
    parsers.FirstLineParser.FirstLineState nextState = stateData.firstLineState.transition(machine);
    if (prevState != nextState) {
        stateData.firstLineData = null;
    }
    stateData.firstLineState = nextState;
    switch (nextState) {
        case errorState :
            return MainState.errorState;
        case nextState :
            machine.stateData = null;
            return MainState.headers;
        default :
            return MainState.firstLine;
    }
}