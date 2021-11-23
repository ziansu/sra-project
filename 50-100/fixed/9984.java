@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    if ((notFirstRun) || (!(com.brainicism.projectrito.MainActivity.summonerName.equals("")))) {
        com.brainicism.projectrito.MainActivity.checkValidSummoner check = new com.brainicism.projectrito.MainActivity.checkValidSummoner();
        check.execute();
    }
}