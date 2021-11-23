@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.field_report_button :
            fieldReportButtonPressed(view);
            break;
        case R.id.complete_button :
            submitListener(view);
            break;
        default :
            break;
    }
}