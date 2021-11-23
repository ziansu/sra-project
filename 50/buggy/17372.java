public chord.analyses.damianoAnalysis.sharingCyclicity.ShBDD restrictOnSecondRegister(joeq.Compiler.Quad.RegisterFactory.Register r) {
    return new chord.analyses.damianoAnalysis.sharingCyclicity.ShBDD(entry, getData().id().and(rv(r).getData()));
}