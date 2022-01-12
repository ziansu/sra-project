public void put(int presetID, org.openhab.binding.bosesoundtouch.internal.ContentItem preset) throws java.io.IOException, org.openhab.binding.bosesoundtouch.internal.exceptions.ContentItemNotPresetableException {
    preset.setPresetID(presetID);
    if (preset.isPresetable()) {
        mapOfPresets.put(presetID, preset);
        writeToFile(presetFile);
    }else {
        throw new org.openhab.binding.bosesoundtouch.internal.exceptions.ContentItemNotPresetableException();
    }
}