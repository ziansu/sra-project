public boolean accepts(konstructs.api.Block block) {
    return ((block.getType()) == (typeId)) && (!(isFull()));
}