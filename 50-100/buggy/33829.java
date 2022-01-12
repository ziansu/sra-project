protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    java.io.File file = getTempFile(getBaseContext());
    android.content.Intent intent = new android.content.Intent(getBaseContext(), niclam.banana_scaler_alpha.DrawingBananaActivity.class);
    intent.putExtra("filename", android.net.Uri.fromFile(file).toString());
    if (resultCode == (RESULT_CANCELED)) {
        finish();
    }else {
        fuckingCheckPermission();
        startActivity(intent);
    }
}