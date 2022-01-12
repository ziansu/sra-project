public void update(cards.Card currentCard) {
    locationString = "src\\gui\\images\\";
    locationString += currentCard.getImageFile();
    java.lang.System.out.println(locationString);
    image = new javax.swing.ImageIcon(locationString);
    scaledImage = image.getImage().getScaledInstance(240, 300, java.awt.Image.SCALE_DEFAULT);
    cardImage = new javax.swing.ImageIcon(scaledImage);
    remove(label);
    label = new javax.swing.JLabel(cardImage);
    add(label);
}