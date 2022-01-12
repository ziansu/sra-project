@java.lang.Override
public boolean hasPermission(@edu.umd.cs.findbugs.annotations.NonNull
org.acegisecurity.Authentication a, @edu.umd.cs.findbugs.annotations.NonNull
hudson.security.Permission permission) {
    return getACL().hasPermission(a, permission);
}