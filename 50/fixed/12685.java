public de.bananaco.bpermissions.api.util.Calculable getCalculable() {
    if ((name) == null)
        return null;
    
    if ((calc) == null)
        return null;
    
    return world.get(name, calc);
}