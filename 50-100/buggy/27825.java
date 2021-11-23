public static org.edx.mobile.view.dialog.AlertDialogFragment newInstance(@android.support.annotation.Nullable
java.lang.String title, @android.support.annotation.NonNull
java.lang.String message) {
    org.edx.mobile.view.dialog.AlertDialogFragment fragment = new org.edx.mobile.view.dialog.AlertDialogFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(org.edx.mobile.view.dialog.AlertDialogFragment.ARG_TITLE, title);
    args.putString(org.edx.mobile.view.dialog.AlertDialogFragment.ARG_MESSAGE, message);
    fragment.setArguments(args);
    return fragment;
}