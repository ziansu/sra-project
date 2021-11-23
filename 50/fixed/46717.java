@java.lang.Override
public boolean hasPermission(net.dv8tion.jda.core.Permission... permissions) {
    for (net.dv8tion.jda.core.Permission perm : permissions) {
        if ((((rawPermissions) >> (perm.getOffset())) & 1) != 1)
            return false;
        
    }
    return true;
}