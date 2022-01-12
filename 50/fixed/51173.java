@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    com.nearit.ui_bindings.feedback.views.NearItUIRatingBar.SavedState savedState = ((com.nearit.ui_bindings.feedback.views.NearItUIRatingBar.SavedState) (state));
    super.onRestoreInstanceState(savedState.getSuperState());
    if ((savedState.rating) != 0) {
        setRating(savedState.rating);
    }
}