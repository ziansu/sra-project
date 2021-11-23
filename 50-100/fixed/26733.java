public de.uniulm.omi.cloudiator.lance.lca.container.ContainerManager getContainerManager(de.uniulm.omi.cloudiator.lance.lca.HostContext contex, de.uniulm.omi.cloudiator.lance.container.spec.os.OperatingSystem operatingSystem, de.uniulm.omi.cloudiator.lance.lca.container.ContainerType containerType) throws de.uniulm.omi.cloudiator.lance.lca.LcaException {
    if (containerType.supportsOsFamily(operatingSystem.getFamily())) {
        synchronized(managers) {
            de.uniulm.omi.cloudiator.lance.lca.container.ContainerManager mng = managers.get(containerType);
            if (mng == null) {
                mng = de.uniulm.omi.cloudiator.lance.lca.container.ContainerManagerFactory.createContainerManager(contex, containerType);
                managers.put(containerType, mng);
            }
            return mng;
        }
    }
    throw new de.uniulm.omi.cloudiator.lance.lca.LcaException(("Operating System and container do not match: " + (operatingSystem.toString())));
}