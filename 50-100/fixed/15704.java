private solitaire.Stack stackClicked(java.awt.event.MouseEvent click) {
    int clickX = click.getX();
    int clickY = click.getY();
    for (solitaire.Stack s : stacks) {
        int cardIndexSelected = s.clickInBounds(clickX, clickY);
        if (cardIndexSelected >= 0)
            return s;
        
    }
    return null;
}