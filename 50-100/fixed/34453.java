@java.lang.Override
public net.nexustools.njs.compiler.RuntimeCompiler.Referencable run(net.nexustools.njs.Global global, net.nexustools.njs.Scope scope) {
    for (init.run(global, scope).get(); condition.run(global, scope).get().toBool(); execute(loop, global, scope)) {
        net.nexustools.njs.BaseObject ret = impl.exec(global, scope);
        if (ret != null) {
            return new net.nexustools.njs.compiler.RuntimeCompiler.Return(ret, rows, columns);
        }
    }
    return net.nexustools.njs.compiler.RuntimeCompiler.UNDEFINED_REFERENCE;
}