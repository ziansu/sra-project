public void setState(long state) {
    gr.entij.StateEvent e = new gr.entij.StateEvent(this, this.state, state);
    this.state = state;
    stateListeners = gr.entij.Entity.fireEvent(stateListeners, e);
}