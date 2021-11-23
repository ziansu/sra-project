@java.lang.Override
public boolean isModified() {
    return !(((de.dm.intellij.maven.archetypes.plugin.ArchetypeCatalogConfigurable.ArchetypeCatalogTableModel) (listModel)).getArchetypeCatalogModels().equals(de.dm.intellij.maven.archetypes.Util.getArchetypeCatalogModels()));
}