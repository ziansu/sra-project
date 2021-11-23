@butterknife.OnClick(value = R.id.btn_save)
public void onSaveClicked() {
    if (validateName()) {
        dialog.dismiss();
        if ((listener) != null) {
            listener.onSaveClicked(txtName.getText().toString());
        }
    }
}