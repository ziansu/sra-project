private void populate(tk.lefourretoutsonore.lefourre_toutsonore.PlayListRelated.PlayList.PlayListChoice choice) {
    playlist = new tk.lefourretoutsonore.lefourre_toutsonore.PlayListRelated.PlayList(choice, this, ipv);
    if (choice == (PlayList.PlayListChoice.LIKES)) {
        playlist.setCurrentUser(currentUser);
        android.util.Log.i("id", ("id = " + (currentUser.getId())));
    }
    dialog = android.app.ProgressDialog.show(this, "", "Chargement...", true);
    playlist.fetchSounds();
}