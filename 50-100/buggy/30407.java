public void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    if (requestCode == 810) {
        if (resultCode == (android.app.Activity.RESULT_OK)) {
            for (int i = 0; i < (recentlevel.length); i++) {
                recentlevel[i] = intent.getIntExtra(("recentlevel" + i), 0);
                android.util.Log.d("level", java.lang.String.valueOf(recentlevel[i]));
            }
        }
    }
    new com.example.shintaku.test.LevelActivity.Loader().execute();
}