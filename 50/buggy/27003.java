@java.lang.Override
public void resize(int width, int height) {
    super.resize(width, height);
    stage.getViewport().update(width, height, true);
}