@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    return new android.app.AlertDialog.Builder(getContext()).setTitle("Warning").setMessage("Are you sure to reboot?").setPositiveButton("Yes", this).setNegativeButton("No", this).setCancelable(true).setOnDismissListener(this).create();
}