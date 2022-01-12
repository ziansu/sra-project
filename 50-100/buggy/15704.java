private solitaire.Stack stackClicked(java.awt.event.MouseEvent click) {
    int clickX = click.getX();
    int clickY = click.getY();
    for (solitaire.Stack s : stacks) {
        int cardIndexSelected = s.clickInBounds(clickX, clickY);
        java.lang.System.out.println(cardIndexSelected);
        if (cardIndexSelected >= 0)
            return s;
        
    }
    return null;
}