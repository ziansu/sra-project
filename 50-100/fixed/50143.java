private void move(java.util.ArrayList from, java.util.ArrayList to, java.lang.Object toMove) {
    for (int i = 0; i < (from.size()); i++) {
        if (from.get(i).equals(toMove)) {
            from.remove(i);
            to.add(toMove);
            return ;
        }
    }
}