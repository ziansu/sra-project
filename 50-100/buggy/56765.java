private void appendGenomes(java.lang.StringBuilder stringBuilder) {
    if ((this.getGenomes().length) != 0) {
        stringBuilder.append("Genomes:\t\t");
        int[] sortedGenomes = this.getGenomes();
        java.util.Arrays.sort(sortedGenomes);
        for (java.lang.Integer i : sortedGenomes) {
            stringBuilder.append(gui.DrawableCanvas.getInstance().getAllGenomesReversed().get(i)).append(" ");
        }
        stringBuilder.append("\n");
    }
}