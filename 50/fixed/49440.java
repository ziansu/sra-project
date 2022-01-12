public static railo.runtime.ComponentImpl loadComponent(railo.runtime.PageContext pc, java.lang.String rawPath, java.lang.Boolean searchLocal, java.lang.Boolean searchRoot) throws railo.runtime.exp.PageException {
    return ((railo.runtime.ComponentImpl) (railo.runtime.component.ComponentLoader.load(pc, rawPath, searchLocal, searchRoot, null, false)));
}