public void setupSettings() {
    json = loadJSONObject("data/settings.json");
    java.lang.String usb = json.getString("usbDevice");
    java.lang.String machine = json.getString("kniticModel");
}