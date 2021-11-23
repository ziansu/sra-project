@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    image = ((android.graphics.Bitmap) (data.getExtras().get("data")));
    setAndOutputTess();
}