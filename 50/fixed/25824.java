@java.lang.Override
public void onClick(android.view.View v) {
    if (sendSMSMessage(getResources().getString(EnumSms.WHERE.getSms()))) {
        locFirst = true;
    }
}