public void onClick(android.view.View v) {
    extractedAlbum = path.getText().toString().substring(path.getSelectionStart(), path.getSelectionEnd()).trim();
    if ((extractedAlbum.length()) > 0) {
        album.setText(extractedAlbum);
    }else {
        album.setText(getResources().getString(R.string.album));
    }
}