@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    android.util.Log.e("map is ckicked", "true");
    openMapFull(requestCode);
}