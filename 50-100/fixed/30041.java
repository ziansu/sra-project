public void applyBorder(Border applied) {
    java.util.ArrayList<java.lang.Integer> pos = applied.getBorderPos();
    for (int i = 0; i < (pos.size()); i += 2) {
        hexpistols[pos.get(i)][pos.get((i + 1))] = applied.getColor();
    }
}