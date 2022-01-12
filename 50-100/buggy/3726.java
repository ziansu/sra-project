@java.lang.Override
public void onClick(android.view.View v) {
    if (isFavorite) {
        dbAdapter.deleteMovie(movieObject.getId());
        favoriteButton.setText(getActivity().getResources().getString(R.string.favorite));
        isFavorite = false;
    }else {
        dbAdapter.insertMovie(movieObject);
        favoriteButton.setText(getActivity().getResources().getString(R.string.unfavorite));
        isFavorite = true;
    }
}