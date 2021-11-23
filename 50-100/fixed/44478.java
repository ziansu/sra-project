public void Show() {
    android.view.View this_view = mContext.loadView(R.layout.screen_top_score);
    android.graphics.Typeface font = android.graphics.Typeface.createFromAsset(mContext.getAssets(), "fonts/hurry up.ttf");
    com.example.swsahu.duplicatecardgame.HelperClass.SetFontToControls(font, ((android.view.ViewGroup) (this_view)));
    addListenerToControls();
    InitializeRobotMemoryListener();
    setBoardDetailsText();
    if (!(isFromGameScreen)) {
        initializeSpecificControls_Set2();
    }
    addFlingListenerToTopScoresScreen(this_view);
    loadPage();
}