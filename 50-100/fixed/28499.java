@java.lang.Override
public void changedUpdate(javax.swing.event.DocumentEvent e) {
    java.lang.String[] completions = AC.getTopN(gui.GUI.NSUGGESTIONS, searchbar.getText());
    updateOutput(completions);
    if (!(frame.getTitle().equals("Autocomplete"))) {
        frame.setTitle("Autocomplete");
    }
}