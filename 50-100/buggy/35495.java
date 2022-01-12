@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.buttonNewGame :
            org.oucho.tetris.MainActivity.intent.setComponent(new android.content.ComponentName("org.oucho.tetris", "org.oucho.tetris.Game"));
            startActivity(org.oucho.tetris.MainActivity.intent);
            intro.stop();
            intro.release();
            break;
        case R.id.buttonHighScores :
            org.oucho.tetris.MainActivity.intent.setComponent(new android.content.ComponentName("org.oucho.tetris", "org.oucho.tetris.HighScores"));
            startActivity(org.oucho.tetris.MainActivity.intent);
            break;
        case R.id.buttonAbout :
            showAboutDialog();
            break;
        default :
            break;
    }
}