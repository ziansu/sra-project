@java.lang.Override
public void render() {
    Gdx.gl.glClearColor(1, 1, 1, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    stage.act();
    stage.draw();
    if ((showProgressUntilTime) < (com.badlogic.gdx.utils.TimeUtils.millis())) {
        if ((progressDialog) != null) {
            progressDialog.dismiss();
        }
    }
}