protected ProteusView.Manager createViewManager(@android.support.annotation.NonNull
com.flipkart.android.proteus.ViewTypeParser parser, @android.support.annotation.NonNull
com.flipkart.android.proteus.ProteusView view, @android.support.annotation.NonNull
com.flipkart.android.proteus.value.Layout layout, @android.support.annotation.NonNull
com.flipkart.android.proteus.value.ObjectValue data, @android.support.annotation.Nullable
android.view.ViewGroup parent, int dataIndex) {
    return parser.createViewManager(context, view, layout, data, parser, parent, dataIndex);
}