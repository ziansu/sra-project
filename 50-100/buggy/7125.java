public int getByIndex(build.games.wraithaven.gui.MenuComponentHeirarchy root, int index, int pos, build.games.wraithaven.gui.MenuComponentHeirarchy[] out) {
    if (index == pos) {
        out[0] = root;
        return -1;
    }
    pos++;
    if (!(root.isCollapsed())) {
        for (build.games.wraithaven.gui.MenuComponentHeirarchy c : root.getChildren()) {
            pos = getByIndex(c, index, pos, out);
            if (pos == (-1)) {
                return -1;
            }
        }
    }
    return pos;
}