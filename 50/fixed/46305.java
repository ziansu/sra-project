@org.junit.Test
public void toggleWindowFocus() {
    assertMainGuiHidden(mainGui.toggleMainGuiUsingCtrlAltDAccelerator());
    assertMainGuiHidden(mainGui.toggleMainGuiUsingCtrlQAccelerator());
    assertMainGuiOpen(mainGui.toggleMainGuiUsingCtrlAltDAccelerator());
}