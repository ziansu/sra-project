public void update(float v) {
    if (this.hasInput()) {
        this.handleInput();
    }
    model.step(v);
    view.update(v);
}