@java.lang.Override
public void onClick(android.view.View v) {
    if (((android.widget.Button) (v)).getText().equals(context.getString(R.string.unmark_favorite))) {
        updateFavoriteStatus(((int) (v.getTag())), true);
    }else {
        updateFavoriteStatus(((int) (v.getTag())), false);
    }
}