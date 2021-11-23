@java.lang.Override
public void run() {
    if (code == (com.philips.lighting.model.PHHueError.BRIDGE_NOT_RESPONDING)) {
        searchForBridge();
        return ;
    }
    if (message.equals("No bridge found")) {
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(R.layout.dialog_warning);
        return ;
    }
    if (code == (com.philips.lighting.model.PHHueError.NO_CONNECTION)) {
        return ;
    }
    android.widget.Toast toast = android.widget.Toast.makeText(this, message, Toast.LENGTH_SHORT);
    toast.show();
}