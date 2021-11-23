@java.lang.Override
public void onPreExecute() {
    mPeoplePager.setAdapter(null);
    mPeoplePager.setEnabled(false);
    mAdapter.closeCursor();
    mAdapter = new com.example.peopleloader.PeopleViewerActivity.PageAdapter(getSupportFragmentManager());
}