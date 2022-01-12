public io.repseq.core.Chains merge(io.repseq.core.Chains other) {
    if (((chains) == null) || ((other.chains) == null))
        return io.repseq.core.Chains.ALL;
    
    java.util.HashSet<java.lang.String> s = new java.util.HashSet<>();
    s.addAll(this.chains);
    s.addAll(other.chains);
    return new io.repseq.core.Chains(s);
}