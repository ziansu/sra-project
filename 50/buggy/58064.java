private void notifyStateChangedToListeners(@android.support.annotation.NonNull
android.view.View bottomSheet, @com.github.ljarka.filterbottomsheet.BottomSheetBehavior.State
int newState) {
    for (com.github.ljarka.filterbottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback : mCallback) {
        bottomSheetCallback.onStateChanged(bottomSheet, newState);
    }
}