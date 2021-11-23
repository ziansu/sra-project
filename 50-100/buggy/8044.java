private javax.swing.JButton createDeleteAlbumButton() {
    javax.swing.ImageIcon deleteAlbumIcon = new javax.swing.ImageIcon("icons/folder_delete_32.png");
    javax.swing.JButton deleteAlbumButton = new javax.swing.JButton("Remove Album");
    deleteAlbumButton.setToolTipText("Delete Selected Album");
    deleteAlbumButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            controller.deleteAlbum();
        }
    });
    return deleteAlbumButton;
}