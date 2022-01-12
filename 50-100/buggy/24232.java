public android.app.Dialog showAgreePermissonDialog(android.content.Context context, final com.xinyi.czbasedevtool.base.interfaces.listener.OnTaskDoneListener doNextListener) {
    closeAllDialog();
    com.afollestad.materialdialogs.MaterialDialog materialDialog = com.xinyi.czbasedevtool.base.manager.ui_about.dialog.MaterialDialogFactory.getInstance(context).createMaterialDialog(context, "权限申请", "接下来的权限提示请点击同意，否则无法往后执行！", "同意", new com.afollestad.materialdialogs.MaterialDialog.SingleButtonCallback() {
        @java.lang.Override
        public void onClick(@android.support.annotation.NonNull
        com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
        com.afollestad.materialdialogs.DialogAction which) {
            com.xinyi.czbasedevtool.base.manager.PermissionManager.myDialogStack.remove(dialog);
            doNextListener.done(null);
        }
    }, null, R.drawable.icon_warning_tip);
    return materialDialog;
}