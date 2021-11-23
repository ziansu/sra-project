private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    in.defaultReadObject();
    dataeaglealpha.timing.onesignal.OneSignalUser.userBiMap.put(oneSignalId, userId);
    if ((userId) >= (dataeaglealpha.timing.onesignal.OneSignalUser.userCounter)) {
        dataeaglealpha.timing.onesignal.OneSignalUser.userCounter = userId;
        (dataeaglealpha.timing.onesignal.OneSignalUser.userCounter)++;
    }
}