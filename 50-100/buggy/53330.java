public static quant.crouton.library.Crouton create(android.view.View view) {
    android.view.View decorView = null;
    android.view.View dependView = null;
    android.content.Context context = null;
    if (null != view) {
        decorView = view.getRootView();
    }
    return new quant.crouton.library.Crouton(context, decorView, null, view, android.view.View.NO_ID);
}