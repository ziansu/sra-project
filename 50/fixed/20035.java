@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.Dialog dialog = super.onCreateDialog(savedInstanceState);
    if ((dialog.getWindow()) != null) {
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
    }
    return dialog;
}