@java.lang.Override
public void onClick(android.view.View view) {
    generateAlbum.setImageResource(R.drawable.ic_action_next_pressed);
    saveAlbumPressed = false;
    saveAlbum.setImageResource(R.drawable.ic_action_save);
    favoriteAlbum.setImageResource(R.drawable.ic_action_favorite);
    try {
        mImage.setImageDrawable(defaultImage);
        generateAlbum();
        displayAlbum();
        generateAlbum.setImageResource(R.drawable.ic_action_next);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}