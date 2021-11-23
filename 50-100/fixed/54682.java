@java.lang.Override
public org.sikuli.script.ScreenImage capture(java.awt.Rectangle rect) {
    org.sikuli.basics.Debug.log(3, "ScreenUnion: capture: (%d,%d) %dx%d", rect.x, rect.y, rect.width, rect.height);
    org.sikuli.script.Screen s = org.sikuli.script.Screen.getPrimaryScreen();
    org.sikuli.script.ScreenImage si = s.capture(rect);
    return si;
}