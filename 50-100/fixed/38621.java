private void init() {
    checkBorders();
    calcHistSizes();
    tails = new java.util.ArrayList(inp.size());
    for (int i = 0; i < (inp.size()); i++) {
        tails.add(createTailChain(i, inp.get(i)));
    }
}