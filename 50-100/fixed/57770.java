@java.lang.Override
public void onPositiveActionClicked(com.rey.material.app.DialogFragment fragment) {
    com.rey.material.app.SimpleDialog dialog = ((com.rey.material.app.SimpleDialog) (fragment.getDialog()));
    android.widget.Toast.makeText(fragment.getDialog().getContext(), (("You have selected " + (dialog.getSelectedValue())) + " as phone ringtone."), Toast.LENGTH_SHORT).show();
    fragment.dismiss();
}