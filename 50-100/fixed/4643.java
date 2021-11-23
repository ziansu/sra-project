@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    java.lang.String title = getArguments().getString(com.proxy.app.dialog.LoginErrorDialog.ARG_TITLE);
    java.lang.String message = getArguments().getString(com.proxy.app.dialog.LoginErrorDialog.ARG_MESSAGE);
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(new android.view.ContextThemeWrapper(getActivity(), R.style.Widget_Proxy_App_Dialog)).setTitle(title).setMessage(message).setPositiveButton(R.string.ok, mOnOkClicked);
    android.app.Dialog dialog = builder.create();
    return dialog;
}