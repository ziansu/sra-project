public void saveNewInputToProfile(android.view.View view) {
    editMyProfileView.saveTextFieldsToProfile(myProfile);
    if (!(canceledByError)) {
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putSerializable("sendProfile", myProfile);
        intent.putExtras(bundle);
        setResult(2, intent);
        finish();
    }
}