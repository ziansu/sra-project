@java.lang.Override
public boolean tap(float x, float y, int count, int button) {
    java.lang.System.out.println(((("tap X: " + x) + " Y: ") + y));
    r = ((float) (java.lang.Math.random()));
    clickResponse = hView.handleClick(x, y);
    if ((clickResponse.getNextView()) != null) {
        hView = viewGenerator.getView(clickResponse.getNextView(), h, w);
    }
    return false;
}