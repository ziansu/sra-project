private boolean validateName() {
    java.lang.String newGroupName = groupName.getText().toString();
    if (com.fibelatti.raffler.views.utils.StringHelper.isNullOrEmpty(newGroupName)) {
        groupNameLayout.setError(getString(R.string.group_form_msg_validate_name));
        requestFocus(groupName);
        return false;
    }else {
        group.setName(newGroupName);
        groupNameLayout.setError(null);
        groupNameLayout.setErrorEnabled(false);
    }
    return true;
}