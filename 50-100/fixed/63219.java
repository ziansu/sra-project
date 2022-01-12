public void copyTuplesFromCycle(joeq.Compiler.Quad.RegisterFactory.Register source, joeq.Compiler.Quad.RegisterFactory.Register dest, chord.analyses.damianoAnalysis.sharingCyclicity.CTuples ctuples) {
    chord.analyses.damianoAnalysis.sharingCyclicity.FieldSet fs = null;
    java.util.List<chord.analyses.damianoAnalysis.sharingCyclicity.FieldSet> l = ctuples.findTuplesByRegister(source);
    java.util.Iterator<chord.analyses.damianoAnalysis.sharingCyclicity.FieldSet> it = l.iterator();
    while (it.hasNext()) {
        fs = it.next();
        addTuple(dest, dest, fs, fs);
    } 
}