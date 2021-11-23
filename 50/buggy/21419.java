public void setMotifs(java.util.List<org.jebtk.bioinformatics.motifs.Motif> motifs, org.jebtk.bioinformatics.motifs.MotifView view) {
    mMotifs = motifs;
    mView = view;
    setLayout(new org.jebtk.graphplot.figure.FigureLayoutVBox());
    init();
}