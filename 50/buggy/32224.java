@java.lang.Override
public void onBackPressed() {
    com.bruyu.imagewalker.ImageManager.cancelAll();
    com.bruyu.imagewalker.ImageManager.cleanHouse();
    super.onBackPressed();
    super.onStop();
}