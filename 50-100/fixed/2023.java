private void deleteTree(java.io.File tree) {
    if (tree == null) {
        return ;
    }
    for (java.io.File file : tree.listFiles()) {
        if (file.isDirectory()) {
            deleteTree(file);
            file.delete();
        }else {
            file.delete();
        }
    }
    tree.delete();
}