@butterknife.OnCheckedChanged(value = in.testpress.testpress.R.id.review)
void onChecked(boolean checked) {
    attemptItem.setCurrentReview(checked);
    if (checked)
        questionsView.setBackgroundColor(Color.LTGRAY);
    else
        questionsView.setBackgroundColor(android.R.color.transparent);
    
}