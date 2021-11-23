private java.util.List<org.deviceconnect.android.deviceplugin.irkit.settings.fragment.IRKitVirtualProfileListFragment.VirtualProfileContainer> createDeviceContainers() {
    java.util.List<org.deviceconnect.android.deviceplugin.irkit.settings.fragment.IRKitVirtualProfileListFragment.VirtualProfileContainer> containers = new java.util.ArrayList<org.deviceconnect.android.deviceplugin.irkit.settings.fragment.IRKitVirtualProfileListFragment.VirtualProfileContainer>();
    mProfiles = mDBHelper.getVirtualProfiles(mServiceId);
    if ((mProfiles) != null) {
        for (org.deviceconnect.android.deviceplugin.irkit.data.VirtualProfileData device : mProfiles) {
            containers.add(createContainer(device));
        }
    }
    return containers;
}