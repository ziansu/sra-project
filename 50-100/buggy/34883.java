@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    android.content.Intent intent = new android.content.Intent(getBaseContext(), com.example.user.myapplication.ResultActivity.class);
    intent.putExtra("path", mCurrentPhotoPath);
    intent.putExtra("imageName", imageName);
    startActivity(intent);
}