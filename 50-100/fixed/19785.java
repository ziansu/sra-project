public static boa.debugger.Value callCompilerAdd(java.util.ArrayList<boa.debugger.Value> operands, boa.debugger.Env<boa.debugger.Value> env) {
    boa.debugger.Value fst = operands.get(0);
    boa.debugger.Value snd = operands.get(1);
    if (fst instanceof boa.debugger.SetVal) {
        java.util.HashSet set = ((java.util.HashSet) (((boa.debugger.SetVal) (fst)).getMap()));
        ((boa.debugger.SetVal) (fst)).add(snd.toString());
        return fst;
    }
    throw new java.lang.UnsupportedOperationException();
}