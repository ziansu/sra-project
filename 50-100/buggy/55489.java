@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem menuItem) {
    if (menuItem.getTitle().equals("Open on Youtube")) {
        android.widget.Toast.makeText(getApplicationContext(), "Opening on Youtube", Toast.LENGTH_LONG).show();
        android.net.Uri youtubeUri = android.net.Uri.parse(playlistLink);
        android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_VIEW, youtubeUri);
        getApplicationContext().startActivity(intent);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Whoops! I don't know what to do with that menu item!", Toast.LENGTH_LONG).show();
    }
    return true;
}