private java.lang.String getPropValue(org.micromanager.asidispim.Data.Devices.Keys device, org.micromanager.asidispim.Data.Properties.Keys name, java.lang.String propNameSubstitute) {
    java.lang.String val;
    if (device == (Devices.Keys.PLUGIN)) {
        val = prefs_.getString(org.micromanager.asidispim.Data.Properties.PLUGIN_PREF_NODE, name, "");
    }else {
        java.lang.String mmDevice = devices_.getMMDevice(device);
        val = "";
        if (mmDevice != null) {
            try {
                val = core_.getProperty(mmDevice, name.toString(propNameSubstitute));
            } catch (java.lang.Exception ex) {
            }
        }
    }
    return val;
}