@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        java.util.ArrayList<io.evercam.PTZPreset> allPresets = io.evercam.PTZPreset.getAllPresets(cameraId);
        if ((getVideoActivity()) != null) {
            getVideoActivity().presetList = allPresets;
        }
        java.util.ArrayList<io.evercam.PTZPreset> customPresets = removeSystemPresetsFrom(allPresets);
        if ((customPresets.size()) > 0) {
            getVideoActivity().presetList = customPresets;
        }
    } catch (io.evercam.PTZException e) {
        e.printStackTrace();
    }
    return null;
}