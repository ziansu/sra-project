private void updateButton(javax.swing.JButton button, tp.pr5.logic.Counter position) {
    switch (position) {
        case BLACK :
            button.setIcon(new javax.swing.ImageIcon(((MainWindow.ICONS_FILEPATH) + "black.png")));
            break;
        case WHITE :
            button.setIcon(new javax.swing.ImageIcon(((MainWindow.ICONS_FILEPATH) + "white.png")));
            break;
        default :
            break;
    }
}