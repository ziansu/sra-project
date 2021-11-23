private static void closeTheWindow() {
    java.lang.System.out.println(StdDraw.frame.getWindowListeners().toString());
    java.lang.System.out.println(StdDraw.frame.getWindowStateListeners().toString());
    StdDraw.frame.dispatchEvent(new java.awt.event.WindowEvent(StdDraw.frame, java.awt.event.WindowEvent.WINDOW_CLOSING));
    return ;
}