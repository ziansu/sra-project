@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    if ((e.getKeyCode()) == 115) {
        timesheet.components.AJFormattedTextField txt = ((timesheet.components.AJFormattedTextField) (e.getComponent()));
        timesheet.panels.TextNotesFrame txtFrame = new timesheet.panels.TextNotesFrame(txt);
        txtFrame.pack();
        txtFrame.setVisible(true);
        java.lang.String notes = txtFrame.getNotes();
        txt.setNotes(notes);
    }
}