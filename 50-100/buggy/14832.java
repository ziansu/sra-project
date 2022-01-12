public static org.wahtod.wififixer.utility.WFScanResult fromBundle(final android.os.Bundle bundle) {
    android.os.Bundle fields = bundle.getBundle(org.wahtod.wififixer.utility.WFScanResult.BUNDLE_KEY);
    org.wahtod.wififixer.utility.WFScanResult out = new org.wahtod.wififixer.utility.WFScanResult();
    out.SSID = fields.getString(org.wahtod.wififixer.utility.WFScanResult.SSID_BUNDLE_KEY);
    out.BSSID = fields.getString(org.wahtod.wififixer.utility.WFScanResult.BSSID_BUNDLE_KEY);
    out.capabilities = fields.getString(org.wahtod.wififixer.utility.WFScanResult.CAPABILITIES_BUNDLE_KEY);
    out.level = fields.getInt(org.wahtod.wififixer.utility.WFScanResult.LEVEL_BUNDLE_KEY);
    out.frequency = fields.getInt(org.wahtod.wififixer.utility.WFScanResult.FREQUENCY_BUNDLE_KEY);
    bundle.remove(org.wahtod.wififixer.utility.WFScanResult.BUNDLE_KEY);
    return out;
}