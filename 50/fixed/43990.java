@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    dev.ukanth.ufirewall.Api.updateLanguage(getApplicationContext(), dev.ukanth.ufirewall.util.G.locale());
    menuSetApplyOrSave(menu, dev.ukanth.ufirewall.Api.isEnabled(this));
    return true;
}