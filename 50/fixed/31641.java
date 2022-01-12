public void enter() {
    active = true;
    Root.INSTANCE.renderSystem.addObject(background, 3);
    Root.INSTANCE.input.addProcessor(input);
}