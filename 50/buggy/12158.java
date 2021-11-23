@java.lang.Override
public void onFeedbackSelected(org.eyeseetea.malariacare.database.model.Survey survey) {
    org.eyeseetea.malariacare.database.utils.Session.getSurveyByModule(Constants.FRAGMENT_FEEDBACK_KEY);
    tabHost.setCurrentTabByTag(getResources().getString(R.string.tab_tag_improve));
    sentFragment.getView().setVisibility(View.GONE);
    initFeedback();
}