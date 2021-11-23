private void validateSaveExit() {
    java.lang.String groupPsswd = checkNonEmpty(R.id.txtGroupPsswd, "Password");
    if ((groupPsswd != null) && ((groupID) != null)) {
        android.content.Intent intent = new android.content.Intent(getApplication().getBaseContext(), com.example.project.forrent.MainActivity.class);
        intent.putExtra("groupID", groupID);
        intent.putExtra("password", groupPsswd);
        int CREATE_GROUP_INTENT = 2;
        setResult(com.example.project.forrent.RESULT_OK, intent);
        startActivityForResult(intent, CREATE_GROUP_INTENT);
    }
}