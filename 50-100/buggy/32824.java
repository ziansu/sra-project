private void appendOpenUps(java.lang.StringBuffer sb, int pc) {
    for (int j = 0; j < (prototype.maxstacksize); j++) {
        org.luaj.vm2.luajc.VarInfo v = (pc < 0) ? params[j] : vars[j][pc];
        if (((v != null) && ((v.pc) == pc)) && (v.allocupvalue)) {
            sb.append((("    open: " + (v.upvalue)) + "\n"));
        }
    }
}