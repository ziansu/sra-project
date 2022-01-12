@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (buttonView == (favoriteCheckbox)) {
        rssItem.setFavorite(isChecked);
        if ((delegate) != null) {
            getDelegate().onFavoriteClicked(this, rssItem);
        }
    }
}