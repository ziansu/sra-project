@java.lang.Override
public void close() {
    if ((mNewtCanvasAWT) != null) {
        mNewtCanvasAWT = null;
        return ;
    }
    try {
        mClearGLWindow.close();
    } catch (final java.lang.NullPointerException e) {
    } catch (final java.lang.Throwable e) {
        java.lang.System.err.println(e.getLocalizedMessage());
    }
    super.close();
}