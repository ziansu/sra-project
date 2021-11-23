public void actionPerformed(java.awt.event.ActionEvent arg0) {
    try {
        cardImage = javax.imageio.ImageIO.read(picProvider.getPictureURL(magicCardEditorPanel.getMagicCard()));
        panelPictures.revalidate();
        panelPictures.repaint();
        jsonPanel.showCard(magicCardEditorPanel.getMagicCard());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}