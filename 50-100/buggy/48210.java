@java.lang.Override
public betsy.common.model.engine.EngineExtended getEngineObject() {
    betsy.common.model.engine.EngineExtended engineExtendedId = defaultEngine.getEngineObject();
    java.util.List<java.lang.String> configuration = new java.util.LinkedList<>();
    configuration.addAll(engineId.getConfiguration());
    configuration.add("virtual");
    return new betsy.common.model.engine.EngineExtended(pebl.ProcessLanguage.BPEL, engineId.getName(), engineId.getVersion(), engineId.getReleaseDate(), configuration, engineId.getLicense());
}