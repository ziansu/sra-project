public void select(final int tx, final int ty) {
    if (empty()) {
        return ;
    }
    solitaire.Card topCard = top();
    if (!(topCard.isFaceUp())) {
        topCard.flip();
        return ;
    }
    super.select(tx, ty);
    return ;
}