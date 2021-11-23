@java.lang.Override
public boolean accept(java.io.File pathname) {
    if (pathname.getName().equals("org.eclipse.equinox.simpleconfigurator")) {
        com.maxeler.eclipse.installer.MaxelerECJInstaller.configFolder = pathname;
        return true;
    }
    return false;
}