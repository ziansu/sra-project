@java.lang.Override
public int compare(org.jahia.modules.rolesmanager.JCRNodeWrapper o1, org.jahia.modules.rolesmanager.JCRNodeWrapper o2) {
    if (getPermissionPath(o1).equals(getPermissionPath(o2))) {
        return -(o1.getPath().compareTo(o2.getPath()));
    }
    return getPermissionPath(o1).compareTo(getPermissionPath(o2));
}