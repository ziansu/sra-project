public parsers.MainState transition(parsers.StateMachine machine) {
    if ((machine.stateData) == null) {
        machine.stateData = new parsers.HeaderParser.Data();
    }
    parsers.HeaderParser.Data stateData = ((parsers.HeaderParser.Data) (machine.stateData));
    parsers.HeaderParser.HeaderState prevState = stateData.headerState;
    parsers.HeaderParser.HeaderState nextState = stateData.headerState.transition(machine);
    if (prevState != nextState) {
        stateData.headerData = null;
    }
    stateData.headerState = nextState;
    switch (nextState) {
        case nextState :
            machine.stateData = null;
            return MainState.body;
        case errorState :
            return MainState.errorState;
        default :
            return MainState.headers;
    }
}