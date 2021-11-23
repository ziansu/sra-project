private void buildStage() {
    skinLibgdx = new uk.co.redfruit.gdx.skyisfalling.screens.Skin(Gdx.files.internal(Constants.SKIN_LIBGDX));
    stage.clear();
    uk.co.redfruit.gdx.skyisfalling.screens.Stack stack = new uk.co.redfruit.gdx.skyisfalling.screens.Stack();
    stage.addActor(stack);
    stack.setSize(Constants.VIEWPORT_GUI_WIDTH, Constants.VIEWPORT_GUI_HEIGHT);
    stack.addActor(buildBackgroundLayer());
    stack.add(buildTitleLayer());
    stack.add(buildOptionsLayer());
}