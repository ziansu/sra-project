@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        notFavIcon.setVisibility(View.GONE);
        notFavTv.setVisibility(View.GONE);
        notFavLL.setVisibility(View.GONE);
        favLL.setVisibility(View.VISIBLE);
        favIcon.setVisibility(View.VISIBLE);
        favTv.setVisibility(View.VISIBLE);
        android.widget.Toast.makeText(getActivity(), "Successfully saved in Favorites", Toast.LENGTH_SHORT).show();
    }else {
        android.util.Log.d("Error in Fav", e.getLocalizedMessage());
    }
}