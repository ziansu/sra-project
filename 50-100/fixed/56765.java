private void appendGenomes(java.lang.StringBuilder stringBuilder) {
    if ((this.getGenomes().length) != 0) {
        stringBuilder.append("Genomes:\t\t");
        for (java.lang.Integer i : this.getGenomes()) {
            stringBuilder.append(gui.DrawableCanvas.getInstance().getAllGenomesReversed().get(i)).append(" ");
        }
        stringBuilder.append("\n");
    }
}