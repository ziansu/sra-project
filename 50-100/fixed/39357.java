@java.lang.Override
public java.lang.Object getValueAt(int rowIndex, int columnIndex) {
    com.sdoras.mods.wow.manager.WowMod mod = ((com.sdoras.mods.wow.manager.WowMod) (this.mModManager.getManagedMods().get(rowIndex)));
    if (columnIndex == 0)
        return this.mModManager.isModActive(mod);
    
    if (columnIndex == 1)
        return mod.getName();
    
    if (columnIndex == 2)
        return mod.getVersion();
    
    return null;
}