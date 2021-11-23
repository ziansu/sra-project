@java.lang.Override
public void onDismiss(android.content.DialogInterface dialogInterface) {
    super.onDismiss(dialogInterface);
    if (!(navigateSuccess)) {
        funnel.logCancel();
    }
}