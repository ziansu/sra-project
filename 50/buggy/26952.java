@java.lang.Override
public void onBackPressed() {
    if ((bottomSheetBehavior.getState()) == (android.support.design.widget.BottomSheetBehavior.STATE_EXPANDED)) {
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    }else {
        super.onBackPressed();
    }
}