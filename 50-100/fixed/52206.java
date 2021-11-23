private void setDetailEditFocus() {
    if ((mIdPointer) < (mTotalValidExercises)) {
        int detail_id = mDetailIds.get(mIdPointer);
        if ((getSupportFragmentManager().findFragmentById(detail_id)) != null) {
            ((com.main.toledo.gymtrackr.EditExerciseDetailsFragment) (getSupportFragmentManager().findFragmentById(detail_id))).focusFirstEdit();
            ((com.main.toledo.gymtrackr.EditExerciseDetailsFragment) (getSupportFragmentManager().findFragmentById(detail_id))).implementSwipeListener();
        }
    }
}