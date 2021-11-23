public static void showSnack(android.content.Context mContext, android.view.View mViewById, java.lang.String msg) {
    android.support.design.widget.Snackbar snack = android.support.design.widget.Snackbar.make(mViewById, msg, Snackbar.LENGTH_SHORT);
    android.view.ViewGroup group = ((android.view.ViewGroup) (snack.getView()));
    group.setBackgroundColor(android.support.v4.content.ContextCompat.getColor(mContext, R.color.errorColor));
    snack.show();
}