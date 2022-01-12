public void update() {
    double nstate = key.getState();
    delta = nstate - (state);
    state = nstate;
}