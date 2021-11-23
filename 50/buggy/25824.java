@java.lang.Override
public void onClick(android.view.View v) {
    locFirst = true;
    sendSMSMessage(getResources().getString(EnumSms.WHERE.getSms()));
}