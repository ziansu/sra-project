public void setEditEnable(boolean editEnable) {
    editPhone.setEnabled(editEnable);
    editName.setEnabled(editEnable);
    editID.setEnabled(editEnable);
    textSex.setClickable(editEnable);
    textAge.setClickable(editEnable);
    if (editEnable) {
        saveButton.setVisibility(View.VISIBLE);
    }else {
        saveButton.setVisibility(View.GONE);
    }
}