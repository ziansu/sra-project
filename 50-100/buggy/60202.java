public void select(final int tx, final int ty) {
    if (empty()) {
        return ;
    }
    solitaire.Card topCard = top();
    if (!(topCard.isFaceUp())) {
        java.lang.System.out.println("faceup!");
        topCard.flip();
        return ;
    }
    super.select(tx, ty);
    return ;
}