public void addGlobalEnsureBlock(org.jruby.compiler.ir.representations.BasicBlock geb) {
    _cfg.addVertex(geb);
    _cfg.addEdge(geb, _exitBB)._type = org.jruby.compiler.ir.representations.CFG.CFG_Edge_Type.DUMMY_EDGE;
    for (org.jruby.compiler.ir.representations.BasicBlock b : getNodes()) {
        if ((b != geb) && (!(bbIsProtected(b)))) {
            _cfg.addEdge(b, geb)._type = org.jruby.compiler.ir.representations.CFG.CFG_Edge_Type.EXCEPTION_EDGE;
            _bbRescuerMap.put(b, geb);
            _bbEnsurerMap.put(b, geb);
        }
    }
}