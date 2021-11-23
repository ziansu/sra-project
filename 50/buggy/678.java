private java.lang.String getLevel(int level) {
    if (level >= (tree.getHeight())) {
        return "";
    }else {
        return getLevel(root, level, 0);
    }
}