public static void main(java.lang.String[] args) throws ilog.concert.IloException, java.io.IOException {
    psp.Instance instance = psp.Parser.lireInstance((((("Data" + (java.io.File.separator)) + "Instances") + (java.io.File.separator)) + "instance10.txt"), 1);
    psp.Mip mip = new psp.Mip(instance);
    mip.solve();
}