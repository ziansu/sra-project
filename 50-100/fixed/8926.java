@java.lang.Override
public void display(java.awt.Graphics g) {
    if (isHighlighted()) {
        g.setColor(java.awt.Color.green);
        g.drawRect(x, ((y) + (((totalCards) * (Card.height)) / 2)), Card.width, Card.height);
        setHighlight(false);
    }else {
        g.setColor(java.awt.Color.black);
    }
    totalCards = 0;
    stackDisplay(g, top());
}