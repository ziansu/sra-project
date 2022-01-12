private void move(java.util.ArrayList from, java.util.ArrayList to, java.lang.Object toMove) {
    for (int i = 0; i < (to.size()); i++) {
        if (to.get(i).equals(toMove)) {
            to.remove(i);
            from.add(toMove);
            return ;
        }
    }
}