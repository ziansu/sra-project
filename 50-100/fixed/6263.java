@java.lang.Override
public net.nexustools.njs.compiler.RuntimeCompiler.Referencable run(net.nexustools.njs.Global global, net.nexustools.njs.Scope scope) {
    for (; condition.run(global, scope).get().toBool(); execute(loop, global, scope)) {
        net.nexustools.njs.compiler.RuntimeCompiler.Referencable ref = impl.run(global, scope);
        if (ref instanceof net.nexustools.njs.compiler.RuntimeCompiler.Return) {
            return ref;
        }
        ref.get();
    }
    return net.nexustools.njs.compiler.RuntimeCompiler.UNDEFINED_REFERENCE;
}