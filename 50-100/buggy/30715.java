private void setVal(N nHashN, D nHashD, V l) {
    synchronized(val) {
        if (l == (valueLattice.topElement()))
            val.put(nHashN, nHashD, l);
        else
            val.put(nHashN, nHashD, l);
        
    }
    heros.solver.IDESolver.logger.debug("VALUE: {} {} {} {}", icfg.getMethodOf(nHashN), nHashN, nHashD, l);
}