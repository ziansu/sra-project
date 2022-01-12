@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.Dialog dialog = super.onCreateDialog(savedInstanceState);
    dialog.setCancelable(cancelable);
    dialog.setCanceledOnTouchOutside(cancelable);
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
    try {
        dialog.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.TRANSPARENT));
    } catch (java.lang.NullPointerException e) {
        e.printStackTrace();
    }
    setStyle(DialogFragment.STYLE_NO_FRAME, android.R.style.Theme);
    return dialog;
}