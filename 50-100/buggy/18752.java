public Block getNextBlock() {
    return new Block(((getHead().getTop()) + ((getHead().getSize()) * (getDirection().horizontal))), ((getHead().getLeft()) + ((getHead().getSize()) * (getDirection().vertical))), getHead().getSize(), getColor());
}