protected final android.graphics.drawable.Drawable GetListSelector() {
    if ((mBuilder.ListSelector) != (-1)) {
        return android.support.v4.content.res.ResourcesCompat.getDrawable(mBuilder.BuilderContext.getResources(), mBuilder.ListSelector, null);
    }
    final android.graphics.drawable.Drawable d = com.macmoim.pang.dialog.util.Utils.ResolveDrawable(mBuilder.BuilderContext, R.attr.ext_dialog_list_selector);
    if (d != null) {
        return d;
    }
    return com.macmoim.pang.dialog.util.Utils.ResolveDrawable(getContext(), R.attr.ext_dialog_list_selector);
}