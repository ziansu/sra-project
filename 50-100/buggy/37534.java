@java.lang.Override
public void onClick(android.view.View v) {
    android.app.Activity parentActivity = getActivity();
    if (parentActivity instanceof it.polito.mad.countonme.interfaces.IActionReportBack) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(AppConstants.SHARING_ACTIVITY_KEY, ((java.lang.String) (getData())));
        bundle.putString(AppConstants.MODE, AppConstants.NEW_MODE);
        ((it.polito.mad.countonme.interfaces.IActionReportBack) (parentActivity)).onAction(new it.polito.mad.countonme.ReportBackAction(ReportBackAction.ActionEnum.ACTION_ADD_NEW_EXPENSE, bundle));
    }
}