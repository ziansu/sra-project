public void setCard(_3_2Game.Card card) throws java.io.IOException {
    this.card = card;
    if (this.vertical)
        im = loadImage(card);
    else
        im = rotate(loadImage(card), 90);
    
    setIcon(new javax.swing.ImageIcon(im));
}