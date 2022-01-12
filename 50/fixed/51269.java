public void dataSetChanged(java.util.List<ch.ethz.inf.vs.a4.funwithflags.Flag> flags) {
    ch.ethz.inf.vs.a4.funwithflags.Data.setAllFlags(flags);
    updateCloseFlagsFromAll();
    ch.ethz.inf.vs.a4.funwithflags.Data.updateMyFlagsFromAll();
}