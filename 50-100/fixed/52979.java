@java.lang.Override
public boolean containsNotAllowedFunctions(de.busybeever.bachelor.data.entity.ScriptEntity entity) {
    return ((validateScript(entity.getMathjaxScript(), "Skript", entity.getId())) | (validateScript(entity.getSolutionScript(), "Skript", entity.getId()))) | (validateScript(entity.getVariableScript(), "Skript", entity.getId()));
}