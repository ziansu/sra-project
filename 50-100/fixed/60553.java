@java.lang.Override
public void onClick(android.view.View v) {
    if ((level) > (lvlMin)) {
        (level)--;
    }else {
        level = lvlMax;
    }
    android.util.Log.d("lv", java.lang.String.valueOf(level));
    page = firstPage;
    new com.example.shintaku.test.Setting2Activity.Loader().execute();
}