@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        favIcon.setVisibility(View.VISIBLE);
        notFavIcon.setVisibility(View.GONE);
        favTv.setVisibility(View.VISIBLE);
        notFavTv.setVisibility(View.GONE);
        favLL.setVisibility(View.VISIBLE);
        notFavLL.setVisibility(View.GONE);
        android.widget.Toast.makeText(getActivity(), "Successfully saved in Favorites", Toast.LENGTH_SHORT).show();
    }else {
        android.util.Log.d("Error in Fav", e.getLocalizedMessage());
    }
}