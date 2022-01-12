private advancedsystemsmanager.flow.FlowComponent removeComponent(int idToRemove, gnu.trove.map.hash.TIntObjectHashMap<advancedsystemsmanager.flow.FlowComponent> componentMap) {
    advancedsystemsmanager.flow.FlowComponent removed = componentMap.get(idToRemove);
    componentMap.remove(idToRemove);
    if ((selectedGroup) == removed) {
        selectedGroup = null;
    }
    return removed;
}