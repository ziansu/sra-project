private javax.swing.JButton createNewAlbumButton() {
    javax.swing.ImageIcon newAlbumIcon = new javax.swing.ImageIcon("icons/folder_add_32.png");
    javax.swing.JButton newAlbumButton = new javax.swing.JButton("New Album");
    newAlbumButton.setToolTipText("New Album");
    newAlbumButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            controller.addNewAlbum();
        }
    });
    return newAlbumButton;
}