private void notifyStateChangedToListeners(@android.support.annotation.Nullable
android.view.View bottomSheet, @com.github.ljarka.filterbottomsheet.BottomSheetBehavior.State
int newState) {
    if ((bottomSheet != null) && ((mCallback) != null)) {
        for (com.github.ljarka.filterbottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback : mCallback) {
            bottomSheetCallback.onStateChanged(bottomSheet, newState);
        }
    }
}