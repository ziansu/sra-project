@java.lang.Override
protected void configureShell(org.eclipse.swt.widgets.Shell shell) {
    super.configureShell(shell);
    shell.setText((org.apache.commons.lang3.StringUtils.isEmpty(title) ? "" : title));
    eu.transkribus.swt.util.SWTUtil.centerShell(shell);
}