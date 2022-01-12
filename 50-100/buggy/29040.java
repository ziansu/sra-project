@java.lang.Override
protected void asProductions(org.rascalmpl.value.IValueFactory vf, org.rascalmpl.value.type.TypeStore store, org.rascalmpl.value.ISetWriter grammar, java.util.Set<org.rascalmpl.value.IConstructor> done) {
    getReturnType().asProductions(vf, store, grammar, done);
    for (org.rascalmpl.value.type.Type arg : getArgumentTypes()) {
        arg.asProductions(vf, store, grammar, done);
    }
}