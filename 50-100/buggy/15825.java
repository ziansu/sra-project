public void actionPerformed(java.awt.event.ActionEvent e) {
    main.AnimeIndex.wishlistDialog.setLocation(((main.AnimeIndex.wishlistDialog.getLocationOnScreen().x) - 1), main.AnimeIndex.mainFrame.getLocationOnScreen().y);
    main.AnimeIndex.mainFrame.requestFocus();
    if ((main.AnimeIndex.wishlistDialog.getLocationOnScreen().x) == ((main.AnimeIndex.mainFrame.getLocationOnScreen().x) - 175)) {
        ((javax.swing.Timer) (e.getSource())).stop();
        java.lang.System.out.println("Timer stopped");
    }
}