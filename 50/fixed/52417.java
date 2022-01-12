@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    super.onDismiss(dialog);
    if ((getPresenter()) != null)
        getPresenter().onDismiss();
    
}