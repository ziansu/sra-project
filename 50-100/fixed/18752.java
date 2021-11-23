public Block getNextBlock() {
    return new Block(((getHead().getLeft()) + ((getHead().getSize()) * (getDirection().horizontal))), ((getHead().getTop()) + ((getHead().getSize()) * (getDirection().vertical))), getHead().getSize(), getColor());
}