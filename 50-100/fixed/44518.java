@java.lang.Override
public void showSurveys(java.util.List<br.com.futusteps.survey.core.survey.Survey> surveys) {
    if ((getContext()) == null) {
        return ;
    }
    if ((surveys == null) || (surveys.isEmpty())) {
        empty.setVisibility(View.VISIBLE);
    }else {
        empty.setVisibility(View.GONE);
    }
    mListAdapter.replaceData(surveys);
}