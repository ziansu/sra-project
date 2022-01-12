@java.lang.Override
public void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    super.onListItemClick(l, v, position, id);
    if (position == 0)
        return ;
    
    org.eyeseetea.malariacare.database.utils.Session.setSurvey(surveyList.get((position - 1)));
    getActivity().finish();
    android.content.Intent surveyIntent = new android.content.Intent(v.getContext(), org.eyeseetea.malariacare.MainActivity.class);
    v.getContext().startActivity(surveyIntent);
}