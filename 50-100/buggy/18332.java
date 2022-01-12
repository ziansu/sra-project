private void addPageButton(com.badlogic.gdx.scenes.scene2d.Group table, java.lang.String text, final int i, com.cardshifter.gdx.screens.Skin skin) {
    com.cardshifter.gdx.screens.TextButton button = new com.cardshifter.gdx.screens.TextButton(text, skin);
    button.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener() {
        @java.lang.Override
        public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
            displayPage(((page) + i));
        }
    });
    table.addActor(button);
}