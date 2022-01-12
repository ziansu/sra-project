@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent we) {
    java.awt.Window window = we.getWindow();
    cct.JamberooMolecularEditor.windows.remove(window);
    --(Number_of_open_windows);
    window.dispose();
    if ((cct.JamberooMolecularEditor.windows.size()) == 0) {
        cct.dialogs.JamberooFrame frame = createJamberooInstance("Jamberoo - Main Window", args);
        cct.JamberooMolecularEditor.windows.add(frame);
        ++(Number_of_open_windows);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addNewEditorMenuItem(frame);
        centerOnScreen(frame);
        frame.setVisible(true);
    }
}