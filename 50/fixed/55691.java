@java.lang.Override
public boolean accept(java.io.File pathname) {
    if (pathname.getName().equals("org.eclipse.equinox.simpleconfigurator")) {
        return true;
    }
    return false;
}