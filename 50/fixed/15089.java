@java.lang.Override
public void onBackPressed() {
    new com.bitschupfa.sw16.yaq.ui.HostCloseConnectionDialog(this, castHelper, true).show(getFragmentManager(), com.bitschupfa.sw16.yaq.activities.GameAtHost.TAG);
}