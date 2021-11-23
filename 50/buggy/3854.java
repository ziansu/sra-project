@java.lang.Override
public void onBackPressed() {
    if ((slider.getCurrentItem()) == 0) {
        super.onBackPressed();
    }else {
        slider.setCurrentItem(((slider.getCurrentItem()) - 1));
    }
}