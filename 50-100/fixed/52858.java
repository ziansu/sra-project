private void validateSaveExit() {
    java.lang.String groupID = checkNonEmpty(R.id.txtGroupID, "Group ID");
    java.lang.String groupPsswd = checkNonEmpty(R.id.txtGroupPsswd, "Password");
    if ((groupID != null) && (groupPsswd != null)) {
        android.content.Intent intent = new android.content.Intent(getApplication().getBaseContext(), com.example.project.forrent.MainActivity.class);
        intent.putExtra("groupID", groupID);
        intent.putExtra("password", groupPsswd);
        int JOIN_GROUP_INTENT = 3;
        setResult(com.example.project.forrent.RESULT_OK, intent);
        startActivityForResult(intent, JOIN_GROUP_INTENT);
    }
}