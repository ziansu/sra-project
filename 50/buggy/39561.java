public java.lang.Integer generateConnectionForNode(int mc, int node) {
    int q = app.generation.logics.RandomLogic.random.nextInt(mc);
    while (q == node) {
        q = app.generation.logics.RandomLogic.random.nextInt(mc);
    } 
    return q;
}