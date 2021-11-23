@java.lang.Override
public void onPreExecute() {
    mPeoplePager.setAdapter(null);
    mAdapter.closeCursor();
    mAdapter = new com.example.peopleloader.PeopleViewerActivity.PageAdapter(getSupportFragmentManager());
}