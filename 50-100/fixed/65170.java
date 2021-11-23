public void nextQuestion() {
    currentOption = null;
    int idx = (mPager.getCurrentItem()) + 1;
    if (idx < (mAdapter.getCount())) {
        mPager.setCurrentItem(idx);
    }else {
        android.widget.Toast.makeText(getContext(), R.string.challenge_all_questions_complete, Toast.LENGTH_SHORT).show();
        submitParticipantEntry();
    }
}