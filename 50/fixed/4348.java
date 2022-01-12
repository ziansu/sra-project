@java.lang.Override
public void onClick(final android.view.View v) {
    final java.lang.String key = mRecipeAdapter.getRef(position).getKey();
    doDelete(key, item);
}