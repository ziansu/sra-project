@java.lang.Override
public void changed(cg.group4.view.screen.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    cg.group4.game_logic.StandUp.getInstance().getStroll().joinMultiPlayerEvent(java.lang.Integer.parseInt(cCode.getText()), new cg.group4.server.database.ResponseHandler() {
        @java.lang.Override
        public void handleResponse(cg.group4.server.database.Response response) {
            java.lang.String ip = ((java.lang.String) (response.getData()));
            if (ip == null) {
                ip = "Wrong code!";
            }
            cCode.setText(ip);
        }
    });
}