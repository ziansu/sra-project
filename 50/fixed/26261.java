@java.lang.Override
public void onBackPressed() {
    if ((mBottomSheetBehavior.getState()) == (android.support.design.widget.BottomSheetBehavior.STATE_EXPANDED))
        mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    else
        super.onBackPressed();
    
}