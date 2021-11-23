private void setVal(N nHashN, D nHashD, V l) {
    synchronized(val) {
        val.put(nHashN, nHashD, l);
    }
    heros.solver.IDESolver.logger.debug("VALUE: {} {} {} {}", l, nHashD, nHashN, icfg.getMethodOf(nHashN));
}