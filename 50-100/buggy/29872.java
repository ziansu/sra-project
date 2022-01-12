@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    views.DateView.SavedState savedState = ((views.DateView.SavedState) (state));
    super.onRestoreInstanceState(((views.DateView.SavedState) (state)).getSuperState());
    views.Day selectedDay = savedState.mSelectedDay;
    if (selectedDay != null) {
        dateRecycler.scrollToDay(selectedDay);
        dateSelected.setText(selectedDay.getMonthName());
    }else {
        timber.log.Timber.v("Scrolling to present");
        dateRecycler.scrollToPresent();
    }
}