void fillReduce() {
    Firstplus fp = new Firstplus(grammer);
    follow = fp.getFollow();
    for (State state : automaton) {
        fillReduce(state);
    }
}