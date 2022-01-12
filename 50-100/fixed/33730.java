@java.lang.Override
public synchronized java.util.Set<org.eclipse.equinox.p2.metadata.IInstallableUnit> getExternalUnits() {
    if ((externalUnits) == null) {
        externalUnits = new java.util.LinkedHashSet<>();
        for (org.fedoraproject.p2.IFedoraBundleRepository index : indices) {
            externalUnits.addAll(index.getExternalUnits());
        }
    }
    return externalUnits;
}