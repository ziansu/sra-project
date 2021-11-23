@java.lang.Override
public void onClick(android.view.View v) {
    if ((uploadBottomSheetBehavior.getState()) == (android.support.design.widget.BottomSheetBehavior.STATE_EXPANDED)) {
        android.util.Log.v(edu.uw.abourn.audioroam.MapActivity.TAG, "collapsing bottom sheet");
        uploadBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        uploadFab.setImageResource(R.drawable.ic_add_24dp);
        uploadFab.setBackgroundTintList(android.content.res.ColorStateList.valueOf(R.color.colorAccent));
    }else {
        android.util.Log.v(edu.uw.abourn.audioroam.MapActivity.TAG, "expanding bottom sheet");
        uploadBottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        uploadFab.setImageResource(R.drawable.ic_keyboard_arrow_down_24dp);
    }
}