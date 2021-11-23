@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    validateUserInputs();
    if (isChecked) {
        ptlExpandLayout.setVisibility(View.VISIBLE);
        pollutionReportRequest.setLand_polluted("Yes");
        addLandPollutionData();
    }else {
        pollutionReportRequest.setLand_polluted("No");
        ptlExpandLayout.setVisibility(View.GONE);
    }
}