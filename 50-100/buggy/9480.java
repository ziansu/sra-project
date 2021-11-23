@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_refresh_report_type :
            if (org.cm.podd.report.util.RequestDataUtil.hasNetworkConnection(this)) {
                progress.show();
                android.content.Intent intent = new android.content.Intent(this, org.cm.podd.report.service.SyncReportTypeService.class);
                startService(intent);
            }
            break;
    }
    return true;
}