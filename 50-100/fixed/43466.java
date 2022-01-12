private void addNewTab(java.lang.String title, java.lang.String text, java.lang.String style) {
    org.eclipse.swt.custom.CTabItem noteTabItem = new org.eclipse.swt.custom.CTabItem(noteTabsFolder, org.eclipse.swt.SWT.NONE);
    noteTabItem.setText(title);
    io.github.pyvesb.notepad4e.views.NoteTab tab = new io.github.pyvesb.notepad4e.views.NoteTab(noteTabsFolder, text);
    if ((style.length()) > 0)
        tab.deserialiseStyle(style);
    
    noteTabItem.setControl(tab);
    noteTabs.add(tab);
}