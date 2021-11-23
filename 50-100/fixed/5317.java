private void startRootShell() {
    java.util.List<java.lang.String> cmds = new java.util.ArrayList<java.lang.String>();
    cmds.add("true");
    new dev.ukanth.ufirewall.service.RootShell.RootCommand().setFailureToast(R.string.error_su).setReopenShell(true).run(getApplicationContext(), cmds);
    if (dev.ukanth.ufirewall.util.G.activeNotification()) {
        dev.ukanth.ufirewall.Api.showNotification(dev.ukanth.ufirewall.Api.isEnabled(getApplicationContext()), getApplicationContext());
    }
}