@butterknife.OnCheckedChanged(value = in.testpress.testpress.R.id.review)
void onChecked(boolean checked) {
    attemptItem.setCurrentReview(checked);
}