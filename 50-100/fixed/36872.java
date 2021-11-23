@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    java.lang.String message = getArguments().getString(com.teamtreehouse.ribbit.dialogs.DialogFragmentError.DIALOG_ERROR_MESSAGE_KEY);
    java.lang.String title = getArguments().getString(com.teamtreehouse.ribbit.dialogs.DialogFragmentError.DIALOG_ERROR_TITLE_KEY);
    return new android.app.AlertDialog.Builder(getContext()).setMessage(message).setTitle(title).setPositiveButton(android.R.string.ok, listener).create();
}