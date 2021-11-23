private void setVal(N nHashN, D nHashD, V l) {
    synchronized(val) {
        if (l == (valueLattice.topElement())) {
        }else
            val.put(nHashN, nHashD, l);
        
    }
    heros.solver.IDESolver.logger.debug("VALUE: {} {} {} {}", icfg.getMethodOf(nHashN), nHashN, nHashD, l);
}