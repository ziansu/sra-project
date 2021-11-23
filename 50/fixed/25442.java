public void initializeFragment(android.content.SharedPreferences sharedPreferences) {
    _sharedPreferences = sharedPreferences;
    android.content.res.AssetManager assets = getActivity().getAssets();
    quizData.initializeRound(sharedPreferences);
    loadRoundGuessRows();
    modifyQuizFont(sharedPreferences);
    modifyBackgroundColor(sharedPreferences);
    resetRound();
}