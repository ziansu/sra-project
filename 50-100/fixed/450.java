private boolean isChildOf(build.games.wraithaven.gui.MenuComponentHeirarchy parent, build.games.wraithaven.gui.MenuComponentHeirarchy child) {
    if (parent == child) {
        return true;
    }
    for (build.games.wraithaven.gui.MenuComponentHeirarchy c : parent.getChildren()) {
        if (isChildOf(c, child)) {
            return true;
        }
    }
    return false;
}