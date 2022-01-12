private void notifyOnSlideToListeners(@android.support.annotation.Nullable
android.view.View bottomSheet, float slideOffset) {
    if ((bottomSheet != null) && ((mCallback) != null)) {
        for (com.github.ljarka.filterbottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback : mCallback) {
            bottomSheetCallback.onSlide(bottomSheet, slideOffset);
        }
    }
}