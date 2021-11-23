public com.github.lycastus.semantics.rules.terms.Term reaction(com.github.lycastus.semantics.rules.terms.Term that) {
    com.github.lycastus.semantics.rules.terms.Structure f = funClone();
    f.setArgs(new com.github.lycastus.semantics.rules.terms.Term[args.length]);
    for (int i = 0; i < (args.length); i++) {
        if ((args[i]) instanceof com.github.lycastus.semantics.rules.terms.Term) {
            setArg(i, ((com.github.lycastus.semantics.rules.terms.Term) (args[i])).reaction(that));
        }else {
            setArg(i, args[i]);
        }
    }
    return f;
}