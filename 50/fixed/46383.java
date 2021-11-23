@java.lang.Override
public void startEmergencySMSService() {
    startService(new android.content.Intent(this, com.praxisgs.emergencysms.services.EmergencySMSService.class));
}