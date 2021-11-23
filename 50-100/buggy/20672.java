@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    android.util.Log.e("open", "showattraction");
    attractionListMorePresenter.getAttractionDetailNear("full", attractionsList.get(position).getResulAttraction().getAttractionId(), "fa", "0", tools.Util.getTokenFromSharedPreferences(getApplicationContext()), tools.Util.getAndroidIdFromSharedPreferences(getApplicationContext()));
}