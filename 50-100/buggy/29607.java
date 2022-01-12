protected atg.tools.ant.types.Module getModule(final java.lang.String name) {
    final atg.tools.ant.types.Module cached = modules.get(name);
    if (cached != null) {
        return cached;
    }
    final atg.tools.ant.types.Module module = new atg.tools.ant.types.Module();
    module.setAtg(this);
    module.setModule(atg.tools.ant.util.ModuleUtils.moduleNameToPath(name));
    modules.put(name, module);
    return module;
}