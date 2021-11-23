public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    if (util.window.WishlistDialog.wishListModel.contains("Nessun Anime Corrispondete")) {
        wishlist.setEnabled(false);
        btnDeleteAnime.setEnabled(false);
    }else
        btnDeleteAnime.setEnabled(true);
    
}