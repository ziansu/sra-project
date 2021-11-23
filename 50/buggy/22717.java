public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String name = javax.swing.JOptionPane.showInputDialog(AnimeIndex.wishlistDialog, "Nome Anime", "Aggiungi alla wishlist", javax.swing.JOptionPane.QUESTION_MESSAGE);
    util.window.WishlistDialog.wishListModel.addElement(name);
}