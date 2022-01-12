@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((facebookHelper) != null) {
        facebookHelper.onActivityResult(requestCode, resultCode, data);
    }else {
    }
}