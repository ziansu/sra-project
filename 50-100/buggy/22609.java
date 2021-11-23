@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (object == null) {
        return false;
    }
    if (object == (this)) {
        return true;
    }
    if (!(object instanceof fr.openwide.core.imports.table.common.event.TableImportEvent)) {
        return false;
    }
    fr.openwide.core.imports.table.common.event.TableImportEvent other = ((fr.openwide.core.imports.table.common.event.TableImportEvent) (object));
    return name.equals(other.name);
}