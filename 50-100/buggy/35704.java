private boolean validateItemName() {
    if (com.fibelatti.raffler.views.utils.StringHelper.isNullOrEmpty(groupItemName.getText().toString())) {
        groupItemNameLayout.setError(getString(R.string.group_form_msg_validate_item_name));
        requestFocus(groupItemName);
        return false;
    }else {
        groupItemNameLayout.setErrorEnabled(false);
    }
    return true;
}