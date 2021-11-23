private void beginTable() {
    tableSb.append("\\begin{array}{|l");
    for (int i = 0; i < ((colValues.length) - 1); i++) {
        tableSb.append("|l");
    }
    tableSb.append("|l||l|}");
    tableSb.append(" \\\\ ");
}