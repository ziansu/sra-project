public static dialog.EditTopicDialog newInstance(java.lang.String mTopicName, java.lang.String mTopicID) {
    dialog.EditTopicDialog editTopicDialog = new dialog.EditTopicDialog();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString(Constants.KEY_LIST_NAME, mTopicName);
    bundle.putString(Constants.KEY_LIST_ID, mTopicID);
    editTopicDialog.setArguments(bundle);
    return editTopicDialog;
}