@java.lang.Override
public void execute(final com.github.bordertech.wcomponents.ActionEvent event) {
    java.lang.String txt = txtAdd.getText();
    if (!(com.github.bordertech.wcomponents.util.Util.empty(txt))) {
        messageBox.addMessage(false, txt.trim());
        applySettings();
    }
}