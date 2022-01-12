public void union(int p, int q) {
    int pComponent = find(p);
    int qComponent = find(q);
    if (pComponent == qComponent) {
        return ;
    }
    for (int i = 0; i < (nodeComponents.length); i++) {
        if ((nodeComponents[i]) == pComponent) {
            nodeComponents[i] = qComponent;
        }
    }
}