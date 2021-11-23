@java.lang.Override
public void run() {
    try {
        java.lang.String instanceId = com.google.android.gms.iid.InstanceID.getInstance(context).getToken(senderId, "GCM");
        com.mparticle.MParticle.getInstance().logPushRegistration(instanceId, senderId);
        com.mparticle.internal.PushRegistrationHelper.PushRegistration registration = new com.mparticle.internal.PushRegistrationHelper.PushRegistration();
        registration.instanceId = instanceId;
        registration.senderId = senderId;
        com.mparticle.internal.PushRegistrationHelper.setInstanceId(context, registration);
    } catch (java.lang.Exception ex) {
        com.mparticle.internal.ConfigManager.log(MParticle.LogLevel.ERROR, "Error registering for GCM Instance ID: ", ex.getMessage());
    }
}