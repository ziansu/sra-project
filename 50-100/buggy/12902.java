public java.util.List<ralgorithm.State> pmove() {
    java.util.List<ralgorithm.State> states = new java.util.ArrayList<ralgorithm.State>();
    ralgorithm.State state;
    while (true) {
        state = step();
        if (state == null) {
            java.lang.System.out.println("Got NULL state");
            break;
        }
        states.add(state);
    } 
    for (ralgorithm.Movement m : moves) {
        java.lang.System.out.println("FINALIZING");
        m.finalizeMove();
    }
    return states;
}