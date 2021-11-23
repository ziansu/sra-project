public void afterTextChanged(android.text.Editable s) {
    java.lang.String newText = s.toString();
    if (!(searchText.equals(newText)))
        if ((newText.length()) > 2) {
            searchText = newText;
            if ((task) != null)
                task.cancel(true);
            
            android.util.Log.d("afterTextChanged", "not saved state");
            task = new com.spotify.cuong.spotifystreamers1.MainActivityFragment.SearchArtists();
            task.execute(searchText);
        }
    
}