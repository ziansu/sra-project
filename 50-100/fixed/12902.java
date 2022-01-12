public java.util.List<ralgorithm.State> pmove() {
    java.util.List<ralgorithm.State> states = new java.util.ArrayList<ralgorithm.State>();
    ralgorithm.State state;
    while (true) {
        state = step();
        if (state == null) {
            break;
        }
        states.add(state);
    } 
    for (ralgorithm.Movement m : moves) {
        m.finalizeMove();
    }
    return states;
}