@android.support.annotation.UiThread
public void setSelectedIndices(@android.support.annotation.NonNull
java.lang.Integer[] indices) {
    mBuilder.selectedIndices = indices;
    selectedIndicesList = new java.util.ArrayList<>(java.util.Arrays.asList(indices));
    if (((mBuilder.adapter) != null) && ((mBuilder.adapter) instanceof com.afollestad.materialdialogs.DefaultAdapter)) {
        ((com.afollestad.materialdialogs.DefaultAdapter) (mBuilder.adapter)).notifyDataSetChanged();
    }else {
        throw new java.lang.IllegalStateException("You can only use setSelectedIndices() with the default adapter implementation.");
    }
}