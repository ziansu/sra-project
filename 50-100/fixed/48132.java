@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<fr.sims.coachingproject.model.Sport>> loader, java.util.List<fr.sims.coachingproject.model.Sport> data) {
    if (data != null) {
        mSportList = data;
        displayError(false);
    }else {
        mSportList.clear();
        displayError(true);
    }
    mLevelAdapter.setSports(mSportList);
}