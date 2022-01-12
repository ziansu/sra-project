@java.lang.Override
public void sheetClosed(org.apache.pivot.wtk.Sheet sheet) {
    if (sheet.getResult()) {
        java.io.File convertWthFile = browse.getSelectedFile();
        convertWthText.setText(convertWthFile.getPath());
        if ((pref) != null) {
            pref.put("last_input_raw_wth", convertWthFile.getPath());
        }
    }
}