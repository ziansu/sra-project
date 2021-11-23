private boolean isValid(Pile p, Card c) {
    return (p.checkTop().value) > (c.value) ? False : True;
}