@java.lang.Override
public void onClick(android.view.View v) {
    if (((android.widget.Button) (v)).getText().equals(context.getString(R.string.unmark_favorite))) {
        updateFavoriteStatus(((android.widget.Button) (v)), ((int) (v.getTag())), true);
    }else {
        updateFavoriteStatus(((android.widget.Button) (v)), ((int) (v.getTag())), false);
    }
}