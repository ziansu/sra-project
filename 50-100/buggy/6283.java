@java.lang.Override
public void dispose() {
    if ((shapetex) != null) {
        backtex.dispose();
        shapetex.dispose();
        startcursor.getTexture().dispose();
        endcursor.getTexture().dispose();
        shapetex = null;
    }
}