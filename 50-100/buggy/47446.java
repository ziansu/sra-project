protected void onResume() {
    super.onResume();
    android.util.Log.d(com.mutisya.numbersone.MainActivity.LIFECYCLE, "onResume()");
    loadGameInfo();
    android.util.Log.d(com.mutisya.numbersone.MainActivity.TAG, "---------resume done; loading state");
    reloadGame(gameSize);
    android.util.Log.d(HelpScreen.TAG, ((("VISIBLE::" + (helpScreen.getWidth())) + "x") + (helpScreen.getHeight())));
    helpScreen.showHelp();
}