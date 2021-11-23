@java.lang.Override
public net.nexustools.njs.compiler.RuntimeCompiler.Referencable run(net.nexustools.njs.Global global, net.nexustools.njs.Scope scope) {
    for (; condition.run(global, scope).get().toBool(); loop.run(global, scope).get()) {
        net.nexustools.njs.BaseObject ret = impl.exec(global, scope);
        if (ret != null) {
            return new net.nexustools.njs.compiler.RuntimeCompiler.Return(ret, rows, columns);
        }
    }
    return net.nexustools.njs.compiler.RuntimeCompiler.UNDEFINED_REFERENCE;
}