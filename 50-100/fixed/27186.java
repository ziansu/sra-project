public void addToast() {
    android.widget.Toast added_to_watchlist = android.widget.Toast.makeText(this, (((mMovie.getTitle()) + " ") + (getString(R.string.added_to_watchlist))), Toast.LENGTH_LONG);
    android.widget.TextView message = ((android.widget.TextView) (added_to_watchlist.getView().findViewById(android.R.id.message)));
    if (message != null)
        message.setGravity(Gravity.CENTER);
    
    added_to_watchlist.show();
}