public static boolean showCodeEntryDialog(java.lang.String title, java.lang.String code) {
    io.github.davidg95.davidscodelibrary.Dialogs.CodeEntry.dialog = new io.github.davidg95.davidscodelibrary.Dialogs.CodeEntry(title, code);
    io.github.davidg95.davidscodelibrary.Dialogs.CodeEntry.dialog.setDefaultCloseOperation(javax.swing.JDialog.DISPOSE_ON_CLOSE);
    io.github.davidg95.davidscodelibrary.Dialogs.CodeEntry.result = false;
    io.github.davidg95.davidscodelibrary.Dialogs.CodeEntry.dialog.setVisible(true);
    return io.github.davidg95.davidscodelibrary.Dialogs.CodeEntry.result;
}