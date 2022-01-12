@java.lang.Override
public javax.swing.JMenuItem getPopupPresenter() {
    if (!(isInPhpModule())) {
        return null;
    }
    java.lang.String phpCsFixerPath = org.netbeans.modules.php.phpcsfixer.options.PhpCsFixerOptions.getInstance().getPhpCsFixerPath();
    if (org.netbeans.modules.php.api.util.StringUtils.isEmpty(phpCsFixerPath)) {
        javax.swing.JMenuItem item = new javax.swing.JMenuItem();
        item.setVisible(false);
        return item;
    }
    if ((actions) == null) {
        actions = new org.netbeans.modules.php.phpcsfixer.ui.actions.PhpCsFixerActionsFactory.PhpCsFixerActions();
    }
    return actions;
}