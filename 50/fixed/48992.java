public static railo.runtime.InterfaceImpl loadInterface(railo.runtime.PageContext pc, java.lang.String rawPath, java.util.Map interfaceUDFs) throws railo.runtime.exp.PageException {
    return ((railo.runtime.InterfaceImpl) (railo.runtime.component.ComponentLoader.load(pc, rawPath, java.lang.Boolean.TRUE, java.lang.Boolean.TRUE, interfaceUDFs, false)));
}