@java.lang.Override
public void write(java.io.PrintWriter out) throws java.lang.Exception {
    out.printf("[Predictor: %s]\n", this.getClass().getCanonicalName());
    out.println(("K: " + (trees.length)));
    for (mltk.predictor.tree.ensemble.brt.BoostedRegressionTrees rtList : trees) {
        out.println(("Length: " + (rtList.size())));
        for (mltk.predictor.tree.RegressionTree rt : rtList) {
            rt.write(out);
            out.println();
        }
        out.println();
    }
}