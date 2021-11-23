@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    mQuestionPack = org.iliat.gmat.enitity.QuestionPackList.getInst().getList().get(0);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_question_review_fragment);
    org.iliat.gmat.activity.QuestionReviewActivity.PlaceholderFragment.context = this;
    mSectionsPagerAdapter = new org.iliat.gmat.activity.QuestionReviewActivity.SectionsPagerAdapter(getSupportFragmentManager(), mQuestionPack);
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.container)));
    mViewPager.setAdapter(mSectionsPagerAdapter);
}