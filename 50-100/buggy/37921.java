private void updateName(org.eclipse.smarthome.core.library.types.StringType command) throws java.lang.InterruptedException {
    java.lang.String newName = command.toFullString();
    org.openhab.binding.robonect.model.Name name = robonectClient.setName(newName);
    if (name.isSuccessful()) {
        updateState(org.openhab.binding.robonect.RobonectBindingConstants.CHANNEL_MOWER_NAME, new org.eclipse.smarthome.core.library.types.StringType(name.getName()));
    }else {
        logErrorFromResponse(name);
    }
    refreshMowerInfo();
}