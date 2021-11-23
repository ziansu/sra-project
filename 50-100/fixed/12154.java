private javax.swing.ImageIcon getPokemonIcon(java.lang.String pokemonImageString) {
    java.awt.Image myImage;
    javax.swing.ImageIcon myImageIcon = null;
    try {
        myImage = javax.imageio.ImageIO.read(getClass().getResource(((utilities.Settings.POKEMON_IMAGES_ICON_FOLDER()) + pokemonImageString)));
        myImageIcon = new javax.swing.ImageIcon(myImage.getScaledInstance(view.BoxPanel.iconSide, view.BoxPanel.iconSide, java.awt.Image.SCALE_SMOOTH));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return myImageIcon;
}