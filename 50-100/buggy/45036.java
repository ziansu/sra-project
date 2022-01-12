private void replaceTrivialPhiVariables() {
    for (int i = 0; i < (blocklist.length); i++) {
        org.luaj.vm2.luajc.BasicBlock b0 = blocklist[i];
        for (int slot = 0; slot < (prototype.maxstacksize); slot++) {
            org.luaj.vm2.luajc.VarInfo vold = vars[slot][b0.pc0];
            org.luaj.vm2.luajc.VarInfo vnew = vold.resolvePhiVariableValues();
            if (vnew != null) {
                substituteVariable(slot, vold, vnew);
            }
        }
    }
}