public static quant.crouton.library.Crouton create(android.app.Activity activity, @android.support.annotation.IdRes
int id) {
    android.content.Context context = null;
    android.view.View decorView = null;
    if (null != activity) {
        context = activity.getApplicationContext();
        decorView = activity.getWindow().getDecorView();
    }
    return new quant.crouton.library.Crouton(context, decorView, null, id);
}