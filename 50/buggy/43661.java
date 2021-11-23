public wizcards.core.CardNodeElement getSide(java.lang.String side) {
    if (!(this.sides.containsKey(side)));
    {
        throw new java.lang.IllegalArgumentException("Side must exist!");
    }
    return sides.get(side);
}