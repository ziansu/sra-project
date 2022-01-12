@java.lang.Override
public void close() {
    if ((mNewtCanvasAWT) != null) {
        mNewtCanvasAWT = null;
        return ;
    }
    try {
        if ((mClearGLWindow) != null) {
            mClearGLWindow.close();
            mClearGLWindow = null;
        }
    } catch (final java.lang.NullPointerException e) {
    } catch (final java.lang.Throwable e) {
        java.lang.System.err.println(e.getLocalizedMessage());
    }
    super.close();
}