private void buildStage() {
    stage.clear();
    uk.co.redfruit.gdx.skyisfalling.screens.Stack stack = new uk.co.redfruit.gdx.skyisfalling.screens.Stack();
    stage.addActor(stack);
    stack.setSize(Constants.VIEWPORT_GUI_WIDTH, Constants.VIEWPORT_GUI_HEIGHT);
    stack.addActor(buildBackgroundLayer());
    stack.add(buildTitleLayer());
    stack.add(buildOptionsLayer());
}