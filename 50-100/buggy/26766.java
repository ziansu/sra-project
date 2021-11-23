@java.lang.Override
public void onResponse(retrofit2.Call<com.codingblocks.shortlr.models.Result> call, retrofit2.Response<com.codingblocks.shortlr.models.Result> response) {
    java.lang.String shortUrl = "cb.lk/" + (response.body().getShortcode());
    com.codingblocks.shortlr.Utils.saveToClipboard(shortUrl, this);
    manager.removeView(view);
    view = null;
    android.util.Log.d("Checking View", ((view) == null ? "View is null" : "View is not null"));
}