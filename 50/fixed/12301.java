public java.lang.Object callWithNamedValues(railo.runtime.PageContext pc, java.lang.String name, railo.runtime.type.Struct args) throws railo.runtime.exp.PageException {
    return _call(pc, railo.runtime.type.KeyImpl.init(name), args, null, false);
}