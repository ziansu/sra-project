@java.lang.Override
public void onLike() {
    liked[position] = !(liked[position]);
    setLikeDrawable();
    com.lupolupo.android.controllers.retrofit.LupolupoHTTPManager.getInstance().postLikeUnlike(episodeData.id, liked[position]);
}