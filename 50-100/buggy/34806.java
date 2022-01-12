public void settings() {
    android.app.DialogFragment dialog = new com.funhausclicker.saxypandabear.funhausclicker.ConfirmDialog();
    android.os.Bundle args = new android.os.Bundle();
    java.lang.String title = "Error";
    java.lang.String message = "Not supported currently";
    args.putString("title", title);
    args.putString("message", message);
    dialog.setArguments(args);
    dialog.show(getFragmentManager(), "settings");
}