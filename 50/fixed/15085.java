boolean addDevice(java.lang.String device) {
    if (!(devices.contains(device))) {
        devices.add(device);
        notifyItemInserted(((devices.size()) - 1));
        return true;
    }
    return false;
}