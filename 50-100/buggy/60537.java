@java.lang.Override
public com.stepstone.stepper.Step createStep(int position) {
    final com.stepstone.stepper.Step step;
    java.lang.String nextStepBlockedMessage = "";
    switch (position) {
        case net.furtherreach.celerateinstallationhelper.data.FirmwareDownloadSteps.Login :
            step = new net.furtherreach.celerateinstallationhelper.fragments.LoginFragment();
            break;
        case net.furtherreach.celerateinstallationhelper.data.FirmwareDownloadSteps.FirmwareDownload :
            step = new net.furtherreach.celerateinstallationhelper.fragments.FirmwareDownloadFragment();
            break;
        default :
            step = null;
            break;
    }
    android.os.Bundle b = new android.os.Bundle();
    b.putInt(net.furtherreach.celerateinstallationhelper.adapters.FirmwareDownloadStepperAdapter.CURRENT_STEP_POSITION_KEY, position);
    b.putString(net.furtherreach.celerateinstallationhelper.adapters.FirmwareDownloadStepperAdapter.NEXT_STEP_BLOCKED_MSG_KEY, nextStepBlockedMessage);
    ((android.support.v4.app.Fragment) (step)).setArguments(b);
    return step;
}