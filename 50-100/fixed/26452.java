private boolean isIRExist(final java.lang.String serviceId) {
    java.util.List<org.deviceconnect.android.deviceplugin.irkit.data.VirtualProfileData> requests = mDBHelper.getVirtualProfiles(serviceId, null);
    for (org.deviceconnect.android.deviceplugin.irkit.data.VirtualProfileData request : requests) {
        if (((request.getIr()) != null) && ((request.getIr().indexOf("{\"format\":\"raw\",")) != (-1))) {
            return true;
        }
    }
    return false;
}