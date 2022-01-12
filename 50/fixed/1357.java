public static pt.lsts.neptus.systems.external.ExternalSystem registerSystem(pt.lsts.neptus.systems.external.ExternalSystem system) {
    pt.lsts.neptus.systems.external.ExternalSystem resLook = pt.lsts.neptus.systems.external.ExternalSystemsHolder.lookupTable.get(system.getId());
    if (resLook != null)
        return resLook;
    
    pt.lsts.neptus.systems.external.ExternalSystemsHolder.lookupTable.put(system.getId(), system);
    return system;
}