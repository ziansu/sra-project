public static org.broad.igv.ui.WaitCursorManager.CursorToken showWaitCursor() {
    org.broad.igv.ui.util.UIUtilities.invokeOnEventThread(() -> org.broad.igv.ui.IGV.getRootPane().getGlassPane().setVisible(true));
    org.broad.igv.ui.WaitCursorManager.CursorToken token = new org.broad.igv.ui.WaitCursorManager.CursorToken();
    org.broad.igv.ui.WaitCursorManager.tokens.add(token);
    return token;
}