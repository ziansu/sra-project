private void setupInput() {
    inputManager.addProcessor(ui);
    inputManager.addProcessor(shortcutController);
    inputManager.addProcessor(new com.badlogic.gdx.InputAdapter() {
        @java.lang.Override
        public boolean touchDown(int screenX, int screenY, int pointer, int button) {
            ui.unfocusAll();
            return false;
        }
    });
    inputManager.addProcessor(toolManager);
    inputManager.addProcessor(camController);
    toolManager.setDefaultTool();
}