public static int minimaxDecision(State state) {
    int action = 0;
    int v = -(Minimax.MAX_NUMBER);
    for (int a : Minimax.actions(state)) {
        int temp = Minimax.minValue(Minimax.result(state, a));
        if (temp > v) {
            v = temp;
            action = a;
        }
    }
    return action;
}