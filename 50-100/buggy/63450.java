@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    switch (tabMoments.getSelectionIndex()) {
        case 0 :
            compositeNextMoment.setFocus();
            break;
        case 1 :
            compositeEffectiveMoment.setFocus();
            break;
        case 2 :
            spinAvailabilityUnits.setFocus();
            break;
        default :
            _applicationServices.reportCriticalErrorAndTerminate(bogdanrechi.defaultplugins.moment.MomentComposite.ERROR_UNKNOWN_TAB_FOLDER_INDEX);
    }
}