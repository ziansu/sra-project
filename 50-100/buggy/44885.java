@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(this, reports.payu.com.app.payureports.ReportActivity.class);
    intent.putExtra(Constants.REPORT_ID, parsedReportList.getList().get(position).getId());
    intent.putExtra(Constants.EMAIL, email);
    startActivity(intent);
}