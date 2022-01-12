@java.lang.Override
protected void onPostExecute(K keys) {
    super.onPostExecute(keys);
    if (keys == null) {
        return ;
    }
    android.app.Activity context = base.ContextHolder.getContext();
    android.content.Intent openWeb = new android.content.Intent(context, ly.loud.loudly.AuthActivity.class);
    openWeb.putExtra("URL", getAuthUrl());
    openWeb.putExtra("KEYS", keys);
    openWeb.putExtra("AUTHORIZER", copy);
    context.startActivity(openWeb);
}