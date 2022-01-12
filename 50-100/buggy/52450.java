@java.lang.Override
public void processQuad(joeq.Compiler.Quad q) {
    java.lang.System.out.println(("Processing: " + q));
    transferfn.preval.copy(getAllIn(q));
    java.lang.System.out.println(transferfn.preval);
    transferfn.postval = new java.util.HashMap<joeq.Compiler.Quad, optimize.NullChecker.VarSet>(out.get(q));
    transferfn.visitQuad(q);
    for (joeq.Compiler.Quad k : transferfn.postval.keySet())
        setOut(q, k, transferfn.postval.get(k));
    
}