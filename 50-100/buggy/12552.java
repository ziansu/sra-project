@java.lang.Override
public void onClick(android.view.View v) {
    if ((level) < (lvlMax)) {
        (level)++;
    }else {
        level = lvlMin;
    }
    android.util.Log.d("lv", java.lang.String.valueOf(level));
    levelTxt.setText(("レベル" + (java.lang.String.valueOf(level))));
    page = firstPage;
    pageTxt.setText(("ページ" + (java.lang.String.valueOf(page))));
    new com.example.shintaku.test.Setting2Activity.Loader().execute();
}