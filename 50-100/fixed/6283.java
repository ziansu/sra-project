@java.lang.Override
public void dispose() {
    if ((shapetex) != null) {
        backtex.dispose();
        shapetex.getTexture().dispose();
        startcursor.getTexture().dispose();
        endcursor.getTexture().dispose();
        shapetex = null;
    }
}