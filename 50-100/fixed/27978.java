private void getExtraArguments() {
    android.os.Bundle aBundle = getArguments();
    if (aBundle != null) {
        mQuestion = aBundle.getParcelable(MultiPageFragment.EXTRAS_QUESTION);
        mCurrentPosition = aBundle.getInt(MultiPageFragment.EXTRAS_POSITION);
        if ((mQuestion.questionTags) != null)
            isNPS = mQuestion.questionTags.contains(com.getcloudcherry.survey.fragments.QuestionNPSFragment.TAG_TYPE);
        
        isLastPage = (mCurrentPosition) == ((com.getcloudcherry.survey.helper.SurveyCC.getInstance().getSurveyQuestions().size()) - 1);
    }
}