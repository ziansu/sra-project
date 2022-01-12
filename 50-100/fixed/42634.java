@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<fr.sims.coachingproject.model.SportLevel>> loader, java.util.List<fr.sims.coachingproject.model.SportLevel> data) {
    fr.sims.coachingproject.loader.LevelLoader levelLoader = ((fr.sims.coachingproject.loader.LevelLoader) (loader));
    mLevelAdapter.setLevels(levelLoader.mSport, data);
    displayError((data == null));
}