public void applyBorder(Border applied) {
    java.util.ArrayList<java.lang.Integer> pos = applied.getBorderPos();
    for (int i = 0; i < (pos.length); i += 2) {
        hexpistols[i][(i + 1)] = applied.color;
    }
}