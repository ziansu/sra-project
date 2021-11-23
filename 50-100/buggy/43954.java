@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (buttonView == (favoriteCheckbox)) {
        rssItem.setFavorite((!(rssItem.isFavorite())));
        if ((delegate) != null) {
            getDelegate().onFavoriteClicked(this, rssItem);
        }
    }
    android.util.Log.v(io.bloc.android.blocly.ui.adapter.ItemAdapter.TAG, ("Checked changed to: " + isChecked));
}