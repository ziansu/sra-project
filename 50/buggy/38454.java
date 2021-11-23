@java.lang.Override
public void onClick(android.view.View view) {
    validate(0, nameDialog.getText().toString(), mAuth.getCurrentUser().getUid(), hintDialog.getText().toString());
    dialog.dismiss();
}