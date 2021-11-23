@java.lang.Override
public void write(java.io.PrintWriter out) throws java.lang.Exception {
    out.printf("[Predictor: %s]\n", this.getClass().getCanonicalName());
    out.println(("Bagging: " + (groves.size())));
    for (mltk.predictor.tree.RegressionTree[] grove : groves) {
        out.println(("Size: " + (grove.length)));
        for (mltk.predictor.tree.RegressionTree rt : grove) {
            rt.write(out);
            out.println();
        }
        out.println();
    }
}