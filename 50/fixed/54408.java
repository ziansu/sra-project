void reset() {
    for (int i = 0; i < (trees.length); i++)
        trees[i] = new ashe.GameTree(i);
    
    prepare((-1));
}