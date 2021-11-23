@java.lang.Override
public void sheetClosed(org.apache.pivot.wtk.Sheet sheet) {
    if (sheet.getResult()) {
        java.io.File linkFile = browse.getSelectedFile();
        linkText.setText(linkFile.getPath());
        pref.put("last_input_link", linkFile.getPath());
        txtAutoDomeApplyMsg.setText("");
        autoApply = false;
    }
}