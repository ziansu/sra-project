@java.lang.Override
public void onSuccess(java.util.Vector<de.hdm.tellme.shared.bo.Nutzer> result) {
    com.google.gwt.user.client.Window.alert(("" + (result.size())));
    de.hdm.tellme.shared.report.HTMLReportWriter hRW = new de.hdm.tellme.shared.report.HTMLReportWriter();
    hRW.generateReport7(result, b);
}