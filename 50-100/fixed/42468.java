@java.lang.Override
public void onStateChanged(boolean proceed, int type) {
    switch (type) {
        case com.vishrayne.boundregistrationservicetest.dialog.SweetAlertBuilder.ALERT_MSISDN_NOT_REGISTERED :
            if (proceed) {
                finish();
                startActivity(new android.content.Intent(getBaseContext(), com.vishrayne.boundregistrationservicetest.CreateAccountTutorialActivity.class));
            }else {
                changeFragment(com.vishrayne.boundregistrationservicetest.fragment.registration.BaseActionFragment.create(BaseActionFragment.ASK_EXISTING_CUST_DETAILS));
            }
            break;
        default :
            throw new java.lang.RuntimeException("Unknown type for alert builder");
    }
}