public void expandTree() {
    tree.expandRow(0);
    int count = 1;
    for (int i = 0; i < (ip.getFolder().size()); i++) {
        tree.expandRow(count);
        count++;
        for (int j = 1; j < (ip.getFolder().get(i).size()); j++) {
            count++;
        }
    }
}