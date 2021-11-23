@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return position == (survey.getSize()) ? new it.telecomitalia.my.affiancamenti.SurveyLastFragment() : it.telecomitalia.my.affiancamenti.SurveyElementFragment.newInstance(survey.getSurveyElement(position), survey.getSize());
}