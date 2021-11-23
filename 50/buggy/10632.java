@java.lang.Override
public void windowGainedFocus(java.awt.event.WindowEvent e) {
    java.lang.System.out.println("Our window got focus");
    studio_.getDisplayManager().raisedToTop(ourViewer);
}