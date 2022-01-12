@java.lang.Override
public void onClick(android.view.View view) {
    boolean checked = ((android.widget.RadioButton) (view)).isChecked();
    switch (view.getId()) {
        case R.id.wsgh_yes_rb :
            if (checked)
                wsghSpinnerRl.setVisibility(View.GONE);
            
            loadReportingFormSelfFragment();
            if ((getActivity()) instanceof com.unfpa.safepal.report.ReportingActivity) {
                ((com.unfpa.safepal.report.ReportingActivity) (getActivity())).updateNextButtonToSubmit();
            }
            break;
        case R.id.wsgh_someoneelse_rb :
            if (checked)
                wsghSpinnerRl.setVisibility(View.VISIBLE);
            
            break;
    }
}