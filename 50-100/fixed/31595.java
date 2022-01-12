public State doAction(Action a) {
    myButton toPress = state[a.getI()][a.getJ()];
    int[][] actionsDone = this.actionsDone;
    actionsDone[a.getI()][a.getJ()] = 1;
    return new State(LightsOut.toggle(this.state, toPress), actionsDone);
}