@java.lang.Override
public void resize(int width, int height) {
    super.resize(width, height);
    uiViewport.update(width, height, true);
    minimapViewport.update(width, height, false);
}