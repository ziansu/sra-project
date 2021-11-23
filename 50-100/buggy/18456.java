@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 1) {
        android.util.Log.d("PREVIEW", "This Position is PreviewList");
        return com.junseok.snowtest.MainActivity.PreviewFrag.newInstance();
    }else {
        android.util.Log.d("PICTURELIST", "This Position is PictureList");
        return com.junseok.snowtest.MainActivity.PictureList.newInstance();
    }
}