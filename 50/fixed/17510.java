public void displayMessage(android.content.Context c) {
    if (((message) != null) && (c != null)) {
        com.devmobile.ofait.utils.FastDialog.showDialog(c, FastDialog.SIMPLE_DIALOG, message);
    }
}