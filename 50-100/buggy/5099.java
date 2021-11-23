@java.lang.Override
public void apply() {
    org.jebtk.modern.window.ModernWindow window = org.jebtk.modern.window.WindowService.getInstance().findByName(mWindowReference);
    java.lang.System.err.println(((("search for plot window " + (mWindowReference)) + " ") + (window == null)));
    if (window != null) {
        org.jebtk.modern.window.WindowService.setFocus(window);
    }else {
        window = createWindow();
        mWindowReference = window.getTitle();
        window.setVisible(true);
    }
    super.apply();
}