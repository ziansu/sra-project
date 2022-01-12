@java.lang.Override
public org.sikuli.script.ScreenImage capture(java.awt.Rectangle rect) {
    org.sikuli.basics.Debug.log(3, "ScreenUnion: capture: (%d,%d) %dx%d", rect.x, rect.y, rect.width, rect.height);
    org.sikuli.script.Screen s = org.sikuli.script.Screen.getPrimaryScreen();
    org.sikuli.script.Location tl = new org.sikuli.script.Location(rect.getLocation());
    for (org.sikuli.script.Screen sx : Screen.screens) {
        if (sx.contains(tl)) {
            s = sx;
            break;
        }
    }
    org.sikuli.script.ScreenImage si = s.capture(rect);
    return si;
}