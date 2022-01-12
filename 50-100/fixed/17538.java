private boolean permissionCheck() {
    if (((cn.tonlyshy.app.fmpet.utility.PermissionCheckerer.checkFloatWindowPermission(this)) != true) || ((cn.tonlyshy.app.fmpet.utility.PermissionCheckerer.checkNotificationListenerPermission(this)) != true)) {
        if ((cn.tonlyshy.app.fmpet.utility.PermissionCheckerer.checkFloatWindowPermission(this)) != true) {
            cn.tonlyshy.app.fmpet.utility.PermissionCheckerer.requestFloatWindowPermission(this);
        }
        if ((cn.tonlyshy.app.fmpet.utility.PermissionCheckerer.checkNotificationListenerPermission(this)) != true) {
            cn.tonlyshy.app.fmpet.utility.PermissionCheckerer.requestNotificationListenerPermission(this);
        }
    }
    return true;
}