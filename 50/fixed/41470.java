public synthesijer.ast.Module searchModule(java.lang.String name) {
    synthesijer.Manager.SynthesijerModuleInfo info = modules.get(name);
    if (info == null)
        return null;
    
    return info.m;
}