@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    try {
        UploadProfileImage(data.getData());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}