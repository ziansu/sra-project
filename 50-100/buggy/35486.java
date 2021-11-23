@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.Dialog dialog = super.onCreateDialog(savedInstanceState);
    assert (dialog.getWindow()) != null;
    dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.FROYO)) {
        dialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() {
            @java.lang.Override
            public void onShow(android.content.DialogInterface dialog) {
                measureLayout(((android.app.Dialog) (dialog)));
            }
        });
    }
    return dialog;
}