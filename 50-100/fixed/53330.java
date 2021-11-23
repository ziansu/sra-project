public static quant.crouton.library.Crouton create(android.view.View view) {
    android.view.View decorView = null;
    android.content.Context context = null;
    if (null != view) {
        context = view.getContext();
        decorView = view.getRootView();
    }
    return new quant.crouton.library.Crouton(context, decorView, null, view, android.view.View.NO_ID);
}