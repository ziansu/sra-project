public void updateTab(telemetry.FramePart rad) {
    if (rad != null) {
        for (gui.DisplayModule mod : topModules) {
            if (mod != null)
                mod.updateRtValues(rad);
            
        }
        for (gui.DisplayModule mod : bottomModules) {
            if (mod != null)
                mod.updateRtValues(rad);
            
        }
    }
}