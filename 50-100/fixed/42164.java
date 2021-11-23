@java.lang.Override
public void create() {
    h = ((float) (Gdx.graphics.getHeight()));
    w = ((float) (Gdx.graphics.getWidth()));
    viewGenerator = new hview.ViewGenerator();
    hView = viewGenerator.getView("Menu", h, w);
    java.lang.System.out.println(hView.getName());
    gestureDetector = new com.badlogic.gdx.input.GestureDetector(this);
    Gdx.input.setInputProcessor(gestureDetector);
}